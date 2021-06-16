package com.app.services;

import com.app.dao.UserDaoImpl;
import com.app.model.Student;
import com.app.model.Tutor;

public class UserServiceImpl implements IUserService {
	
	private UserDaoImpl userDaoImpl;
	
	

	public UserServiceImpl() {
		super();
		this.userDaoImpl = new UserDaoImpl();
	}

	public String validateStudent(String studmname, String studpwd) {
		return userDaoImpl.validateStudent(studmname, studpwd);
	}

	public Tutor validateTutor(String tutorname, String tutorpwd) {
		
		return userDaoImpl.validateTutor(tutorname, tutorpwd);
	}

	public Tutor getTutor(int tutorId) {
		// TODO Auto-generated method stub
		return userDaoImpl.getTutor(tutorId);
	}

	public Student getStudent(int studId) {
		// TODO Auto-generated method stub
		return userDaoImpl.getStudent(studId);
	}

}
