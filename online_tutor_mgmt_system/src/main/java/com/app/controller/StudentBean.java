package com.app.controller;


import com.app.model.Role;
import com.app.model.Student;
import com.app.services.StudentServiceImpl;

public class StudentBean {
	private String studname,password,email;
	private String role;
	private StudentServiceImpl studentServiceImpl;

	public StudentBean() {
		System.out.println("in student bean");
		studentServiceImpl = new StudentServiceImpl();
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		System.out.println("in name set");
		this.studname = studname;
		System.out.println("studname : "+this.studname);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("in pwd set");
		this.password = password;
		System.out.println("password : "+this.password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("in email set");
		this.email = email;
		System.out.println("email : "+this.email);
		
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		System.out.println("in role set");
		this.role = role;
		System.out.println("role : "+this.role);
	}
	
//	bl method
	public String signupStudent() {
		System.out.println("in sign up student method");
		return studentServiceImpl.registerUser(new Student(studname,email,password,Role.valueOf(role.toUpperCase())));
	}

	public StudentServiceImpl getStudentServiceImpl() {
		return studentServiceImpl;
	}

	public void setStudentServiceImpl(StudentServiceImpl studentServiceImpl) {
		this.studentServiceImpl = studentServiceImpl;
	}

	public String studDetail() {
		return "hi";
	}
	
}
