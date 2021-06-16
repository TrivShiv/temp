package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Tutor;
import com.app.services.StudentServiceImpl;

/**
 * Servlet implementation class TutorSearchServlet
 */
@WebServlet("/search")
public class TutorSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl studentServiceImpl;
//	private com.app.services.StudentServiceImpl
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TutorSearchServlet() {
        super();
        studentServiceImpl = new StudentServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("inside doget search");
		String name = request.getParameter("search");
		System.out.println(name);
	
        List<Tutor> listOfTutors=studentServiceImpl.getAllTutorsBySearch(name);
        System.out.println(listOfTutors);
		request.setAttribute("tutorList", listOfTutors);
		RequestDispatcher rd = request.getRequestDispatcher("view/student/studentDashboard.jsp");
		rd.include(request, response);
	}

}
