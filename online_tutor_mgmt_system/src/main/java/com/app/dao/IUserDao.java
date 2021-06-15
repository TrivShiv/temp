package com.app.dao;

import com.app.model.Student;
//import com.app.model.Student;
import com.app.model.Tutor;

public interface IUserDao {

	String validateStudent(String studmname, String studpwd);
	Tutor validateTutor(String tutorname, String tutorpwd);
	Tutor getTutor(int tutorId);
	Student getStudent(int studId);
}
