package com.app.dao;

import static com.app.utility.HibernateUtils.getSf;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Status;
import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;


public class TutorDaoImpl implements ITutorDao{

	public String registerUser(Tutor tutor) {
		System.out.println("in student dao");
		String message="User registration failed...";
		// 1. get hibernate Session from SessionFactory : openSession
		Session hibSession=getSf().getCurrentSession();
		
		// 2 begin a transaction (tx)
		Transaction tx=hibSession.beginTransaction();//hib pools out DB connection,wraps db cn in Session ,
		//L1 cache is created in empty manner
		try {
			hibSession.save(tutor);
			tutor.setStatus(Status.valueOf("NOTAPPROVED"));
			//success : commit
			tx.commit();
			message="User registered successfully with ID "+tutor.getTutorId();
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

	public List<TrainingMaterial> getAllTrainingMaterialByTutorId(int id) {
		
		
String jpql = "select m from TrainingMaterial m join fetch Tutor t on m.tutor = t.tutorId where t.tutor_id:=id";
//select m.material_id,m.content_type ,m.tutor_id from onlinetutormgmtsystem.training_material m inner join onlinetutormgmtsystem.tutor t  on m.tutor_id = t.tutor_id where t.tutor_id=2;

		
		Session hibSession=getSf().getCurrentSession();
		
		Transaction tx=hibSession.beginTransaction();
		List<TrainingMaterial> listMaterial = null;
		try {
			listMaterial = hibSession.createQuery(jpql, TrainingMaterial.class).setParameter("id", id).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return listMaterial;
	}
	
	
public Set<TrainingMaterial> getTrainingListByTutor(Tutor tutor){
		return tutor.getCreatedTrainingMaterials();
	}

public Tutor getTutor(int tutorId) {
//	String mesg="get student details failed";
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
//		mesg="get details";
	}catch (RuntimeException e) {
		if(tx != null)
			tx.rollback();
		throw e;
	}
	return detaildTutor;
}
	
}
