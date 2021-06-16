package com.app.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.StudentDao;
import com.app.dao.TutorDaoImpl;
import com.app.model.Role;
import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.Tutor;
import com.app.services.StudentServiceImpl;

/**
 * Servlet implementation class studentServlet
 */
@WebServlet(urlPatterns="/getTutorDetails",loadOnStartup=1)
public class GetRequestedTutorList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentServiceImpl studentServiceImpl;
	private StudentDao studentdaoImpl;
	private TutorDaoImpl tutorDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetRequestedTutorList() {
    	
        super();
        System.out.println("in get requested tutor servlet");
		
		studentServiceImpl = new StudentServiceImpl();
		studentdaoImpl = new StudentDao();
		tutorDao= new TutorDaoImpl();
		
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession();
		
		
//		System.out.println("student name from session : "+session.getAttribute("student_name"));
//		System.out.println("student id from session : "+session.getAttribute("student_id"));
		
		Student student =  studentServiceImpl.getStudent((Integer)session.getAttribute("student_id"));
//		  System.out.println(student);
		  
		  
		   Set<StudentTutorMapping> reequestTutorList= studentServiceImpl.getRequestTutorList(student);
		  
//		   System.out.println(student.getStudName());
		   
		   
//		   reequestTutorList.forEach(s->System.out.println(s.getTutors().getTutorName()));
		   
		   request.setAttribute("requesttutorlist", reequestTutorList );
		   RequestDispatcher rd = request.getRequestDispatcher("tutorlist.jsp");
		   rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		 Student student =  studentdaoImpl.getStudent(Integer.parseInt(request.getParameter("studId")));
//		  System.out.println(student);
//		  
//		  
//		   Set<StudentTutorMapping> reequestTutorList= studentServiceImpl.getRequestTutorList(student);
//		  
//		   System.out.println(student.getStudName());
//		   
//		   
//		   reequestTutorList.forEach(s->System.out.println(s.getTutors().getTutorName()));
//		   
//		   request.setAttribute("requesttutorlist", reequestTutorList );
//		   RequestDispatcher rd = request.getRequestDispatcher("tutorlist.jsp");
//		   rd.forward(request, response);
		   
//		   reequestTutorList.forEach(s -> System.out.println(s.getTutors().getTutorName()));
//		   
//			String msg = studentdaoImpl.addStudent(student, tutor);
//			System.out.println("msg from servlet : "+msg);
			
	}

}
