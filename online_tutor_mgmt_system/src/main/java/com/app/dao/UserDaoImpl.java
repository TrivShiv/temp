package com.app.dao;

import org.hibernate.*;
import static com.app.utility.HibernateUtils.getSf;

import com.app.model.Student;
import com.app.model.Tutor;

public class UserDaoImpl implements IUserDao {

	public String validateStudent(String studmname, String studpwd) {
		
//		String jpql = "select s from Student s where s.studName=:username and s.studPwd=:password";
		String jpql = "select s.studName from Student s where s.studName=:username and s.studPwd=:password";
		
		Session hibSession=getSf().getCurrentSession();
		
		Transaction tx=hibSession.beginTransaction();
//		Student student = null;
		String studentName;
		try {
			studentName = hibSession.createQuery(jpql, String.class).setParameter("username", studmname).setParameter("password", studpwd)
					.getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return studentName;
	}

	public Tutor validateTutor(String tutorname, String tutorpwd) {
		
		String jpql = "select t from Tutor t where t.tutorName=:username and t.tutorPwd=:password";
		Session hibSession=getSf().getCurrentSession();
		
		Transaction tx=hibSession.beginTransaction();
		Tutor tutor = null;
		try {
			tutor = hibSession.createQuery(jpql, Tutor.class).setParameter("username", tutorname).setParameter("password", tutorpwd)
					.getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return tutor;
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
		}catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return detaildStud;
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
//			mesg="get details";
		}catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return detaildTutor;
	}


}
