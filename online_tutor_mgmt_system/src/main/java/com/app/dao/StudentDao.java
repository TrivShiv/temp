package com.app.dao;

import com.app.dao.IStudentDao;
import static com.app.utility.HibernateUtils.getSf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.app.model.Status;
import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.Tutor;

import org.hibernate.*;

public class StudentDao implements IStudentDao {

	public String registerUser(Student student) {
		System.out.println("in student dao");
		String message="User registration failed...";
		// 1. get hibernate Session from SessionFactory : openSession
		
		Session hibSession=getSf().getCurrentSession();
		
		
		// 2 begin a transaction (tx)
		Transaction tx=hibSession.beginTransaction();//hib pools out DB connection,wraps db cn in Session ,
		//L1 cache is created in empty manner
		try {
			hibSession.save(student);
			student.setStatus(Status.valueOf("NOTAPPROVED"));
			//success : commit
			tx.commit();
			message="User registered successfully with ID "+student.getStudId();
		} catch (HibernateException e) {
			if(tx != null)
				tx.rollback();
			//inform /alert the caller about exception : re throw the SAME exception to caller (tester)
			throw e;
		} finally {
			if(hibSession != null)
				hibSession.close();
			
			//L1 cache is destroyed n pooled out DB cn rets to the connection pool , 
			//so that SAME DB connection can be reused for another request.
				
		}
		return message;
	}

	public List<Tutor> getAllTutors() {
		System.out.println("getall inside");
		String jpql="select t from Tutor t";
		List<Tutor> tutors = new ArrayList<Tutor>();
		
		SessionFactory sf=getSf();
		Session hs=sf.getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try {
			tutors=hs.createQuery(jpql,Tutor.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!= null)
			   tx.rollback();
			throw e;
		}
		return tutors;
	}

	public Set<StudentTutorMapping> getRequestTutorList(Student student) {
		// TODO Auto-generated method stub
		return student.getStudentSelectedTutorMap();
	}

	public String addStudent(Student student, Tutor tutor) {
		// TODO Auto-generated method stub
		System.out.println("in add student");
		String message="mapping failed...";
		// 1. get hibernate Session from SessionFactory : openSession
		Session hibSession=getSf().openSession();
		StudentTutorMapping studtutmap = null;
		// 2 begin a transaction (tx)
		Transaction tx=hibSession.beginTransaction();//hib pools out DB connection,wraps db cn in Session ,
		//L1 cache is created in empty manner
		try {
			studtutmap = new StudentTutorMapping();
			studtutmap.addStudent(student, tutor);
//			tutor.addStudent(student);
			
			hibSession.saveOrUpdate(tutor);
			hibSession.saveOrUpdate(student);
			hibSession.saveOrUpdate(studtutmap);
			
			System.out.println("student request tutor : "+student.getStudentSelectedTutorMap());
			System.out.println("tutor have student : "+tutor.getTutorSelectedStudentMap());
			
			
			//success : commit
			tx.commit();
			message="mapping done update 3 table from stud dao";
		} catch (HibernateException e) {
			if(tx != null)
				tx.rollback();
			//inform /alert the caller about exception : re throw the SAME exception to caller (tester)
			throw e;
		} finally {
			if(hibSession != null)
				hibSession.close();//L1 cache is destroyed n pooled out DB cn rets to the connection pool , 
			//so that SAME DB connection can be reused for another request.
				
		}
		return message;

	}

	public Tutor getTutor(int tutorId) {
//		String mesg="get student details failed";
		//session
		Session session=getSf().getCurrentSession();
		
		
		//tx
		Transaction tx=session.beginTransaction();
		Tutor detaildTutor = null;
		try {
			//c : transient
			detaildTutor = session.get(Tutor.class, tutorId);//persistent 
			tx.commit();//dirty chking : insert , session closed
			System.out.println("get tutor data from db ");
//			session.evict(detaildTutor);
//			mesg="get details";
		}catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return detaildTutor;
	}

	public Student getStudent(int studId) {
//		String mesg="get student details failed";
		//session
		Session session=getSf().getCurrentSession();
		//tx
		

		Transaction tx=session.beginTransaction();
		Student detaildStud = null;
		try {
			//c : transient
			 detaildStud = session.get(Student.class, studId);//persistent 
			tx.commit();//dirty chking : insert , session closed
			System.out.println("get student data from db ");
//			mesg="get details";
//			session.evict(detaildStud);
		}catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return detaildStud;
	}

	public List<Tutor> getAllTutorsBySearch(String name) {
		System.out.println("inside filtered");
		String jpql="select t from Tutor t where t.tutorName LIKE :nm";
		List<Tutor> tutors = new ArrayList<Tutor>();
		
		SessionFactory sf=getSf();
		Session hs=sf.getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try {
		
			
			tutors=hs.createQuery(jpql,Tutor.class).setParameter("nm","%"+name+"%").getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!= null)
			   tx.rollback();
			throw e;
		}
		return tutors;

	}
	}
	

	
	

