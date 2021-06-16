package com.app.controller;

import java.io.IOException;
import java.util.List;

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
import com.app.model.Tutor;
import com.app.services.StudentServiceImpl;
import com.app.services.UserServiceImpl;

/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/authenticate")
public class studentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentServiceImpl studentServiceImpl;
	private StudentDao studentdaoImpl;
	private TutorDaoImpl tutorDao;
	private UserServiceImpl userServiceImpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentServlet() {
    	
        super();
        System.out.println("in student servlet");
		
		studentServiceImpl = new StudentServiceImpl();
		studentdaoImpl = new StudentDao();
		tutorDao= new TutorDaoImpl();
		userServiceImpl = new UserServiceImpl();
		
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getParameter("role"));
		HttpSession session = request.getSession();
		
		if(request.getParameter("role").equals("student"))
		{
			Student student = userServiceImpl.getStudent(Integer.parseInt(request.getParameter("usrid")));
			if(student != null) {
				List<Tutor> listOfTutor=studentServiceImpl.getAllTutors();
				
				
				session.setAttribute("student_name", student.getStudName());
				session.setAttribute("student_id", student.getStudId());
				session.setAttribute("stud_detail", student);
				
				request.setAttribute("tutorList", listOfTutor);
				RequestDispatcher  rd = request.getRequestDispatcher("view/student/studentDashboard.jsp");
				rd.forward(request, response);
			
			}
		}
		if(request.getParameter("role").equals("tutor")) {
			Tutor tutor = userServiceImpl.getTutor(Integer.parseInt(request.getParameter("usrid")));

			if(tutor != null) {
				RequestDispatcher  rd = request.getRequestDispatcher("view/tutor/tutorDashboard.jsp");
				rd.forward(request, response);
			}
		}
		
		System.out.println(request.getParameter("usrname"));
		System.out.println(request.getParameter("usrname"));
		
		if(request.getParameter("role").equals("admin")) {
			if(request.getParameter("usrname").equals("admin") &&
				request.getParameter("usrpwd").equals("admin@123")) {

				request.setAttribute("adminName", request.getParameter("usrname"));
				RequestDispatcher  rd = request.getRequestDispatcher("view/admin/adminPage.jsp");
				rd.forward(request, response);
			}

			}
		}
		
		
		
	
}
