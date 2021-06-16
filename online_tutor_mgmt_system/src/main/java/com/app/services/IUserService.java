package com.app.services;

import com.app.model.Student;
import com.app.model.Tutor;

public interface IUserService {

	String validateStudent(String studmname, String studpwd);
	Tutor validateTutor(String tutorname, String tutorpwd);
	Tutor getTutor(int tutorId);
	Student getStudent(int studId);
	
}
