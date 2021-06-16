package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.StudentDao;
import com.app.dao.TutorDaoImpl;
import com.app.model.Student;
import com.app.model.Tutor;
import com.app.services.StudentServiceImpl;



/**
 * Servlet implementation class LogOutServlet
 */
@WebServlet("/requestTutor")
public class RequestTutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentServiceImpl studentServiceImpl;
	private TutorDaoImpl tutorDao;
	
	
  public RequestTutorServlet() {
	  studentServiceImpl = new StudentServiceImpl();
	  tutorDao= new TutorDaoImpl();
  }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		String msg =  studentServiceImpl.registerUser(new Student(request.getParameter("studname"),request.getParameter("email"),request.getParameter("password"),Role.valueOf(request.getParameter("role").toUpperCase())));
//		System.out.println("msg : "+msg);
//		request.setAttribute("message", new String(msg));
//		RequestDispatcher  rd = request.getRequestDispatcher("view/admin/validate.jsp");
//		rd.forward(request, response);
		HttpSession session = request.getSession();
		
		Student student =  studentServiceImpl.getStudent((Integer)session.getAttribute("student_id"));
//		  System.out.println(student);
//		  System.out.println(request.getParameter("id"));
		  

//		  System.out.println("tutor object from session : "+session.getAttribute("tutor_detail"));
		  
//		  System.out.println("student object from session : "+session.getAttribute("stud_detail"));
	
		  
//		  session_object.clear()
//		  Tutor tutor = studentDao.getTutor(Integer.parseInt(request.getParameter("id")));
		Tutor tutor =  tutorDao.getTutor(Integer.parseInt(request.getParameter("id")));
//			System.out.println(tutor);
//			
//			String msg = studentServiceImpl.addStudent((Student)session.getAttribute("stud_detail"), (Tutor)session.getAttribute("tutor_detail"));
//			System.out.println("msg from servlet : "+msg);	
		  
		  String msg = studentServiceImpl.addStudent(student, tutor);
//			System.out.println("msg from servlet : "+msg);	
			
			RequestDispatcher rd = request.getRequestDispatcher("getTutorDetails");
			rd.forward(request, response);
	
	}
	
	
}