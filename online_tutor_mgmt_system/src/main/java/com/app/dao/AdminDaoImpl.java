package com.app.dao;

import static com.app.utility.HibernateUtils.getSf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public class AdminDaoImpl implements IAdminDao {

	
//	public List<Tutor> getAllTutors() {
//		System.out.println("getall inside");
//		String jpql="select t from Tutor t";
//		List<Tutor> tutors = new ArrayList<Tutor>();
//		
//		SessionFactory sf=getSf();
//		Session hs=sf.getCurrentSession();
//		Transaction tx=hs.beginTransaction();
//		try {
//			tutors=hs.createQuery(jpql,Tutor.class).getResultList();
//			tx.commit();
//		} catch (RuntimeException e) {
//			if(tx!= null)
//			   tx.rollback();
//			throw e;
//		}
//		return tutors;
//	}
	public List<TrainingMaterial> getAllMaterialList() {
		
		System.out.println("inside getAllMaterialList");
		String jpql="select m from TrainingMaterial m";
		List<TrainingMaterial> materialLists = new ArrayList<TrainingMaterial>();
		
		SessionFactory sf=getSf();
		Session hs=sf.getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try {
			materialLists=hs.createQuery(jpql,TrainingMaterial.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!= null)
			   tx.rollback();
			throw e;
		}
		return materialLists;
	}

	public List<Student> getAllStudent() {
		System.out.println("inside getAllStudent");
		String jpql="select s from Student s";
		List<Student> students = new ArrayList<Student>();
		
		SessionFactory sf=getSf();
		Session hs=sf.getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try {
			students=hs.createQuery(jpql,Student.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!= null)
			   tx.rollback();
			throw e;
		}
		return students;
	}

	public List<Tutor> getAllTutor() {
		System.out.println("inside getAllTutor");
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

	public Set<StudentTutorMapping> getStudentWithRespectToTutor(Tutor tutor) {
		
		return tutor.getTutorSelectedStudentMap();
	}

}
