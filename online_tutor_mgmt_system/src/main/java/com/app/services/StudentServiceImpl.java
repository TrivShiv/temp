package com.app.services;

import java.util.List;
import java.util.Set;

import com.app.dao.StudentDao;
import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.Tutor;
import com.app.services.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new StudentDao();
			
	}

	public String registerUser(Student student) {
		return studentDao.registerUser(student);
	}

	
	public List<Tutor> getAllTutors() {
		
		return studentDao.getAllTutors();
	}


	public Set<StudentTutorMapping> getRequestTutorList(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRequestTutorList(student);
	}

	public String addStudent(Student student, Tutor tutor) {
		// TODO Auto-generated method stub
		return studentDao.addStudent(student, tutor);
	}

	public Tutor getTutor(int tutorId) {
		// TODO Auto-generated method stub
		return studentDao.getTutor(tutorId);
	}

	public Student getStudent(int studId) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(studId);
	}

	public List<Tutor> getAllTutorsBySearch(String name) {
		return  studentDao.getAllTutorsBySearch(name);
	}
	
//	public List<Tutor> getAllTutors() {
//		return studentDao.getAllTutors();
//	}

}
