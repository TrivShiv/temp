package com.app.dao;

import java.util.List;
import java.util.Set;

import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.Tutor;

public interface IStudentDao {

//registration
	String registerUser(Student student);
	List<Tutor> getAllTutors();
	Set<StudentTutorMapping> getRequestTutorList(Student student);
	String addStudent(Student student,Tutor tutor);
	Tutor getTutor(int tutorId);
	Student getStudent(int studId);
	List<Tutor> getAllTutorsBySearch(String name);
	
}
