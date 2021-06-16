package com.app.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.StudentDao;
import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.Tutor;
import com.app.services.AdminServiceImpl;
import com.app.services.IAdminService;



/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/getStudentByTutorList")
public class GetStudnetByTutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminServiceImpl adminServiceImpl;
    private StudentDao studentDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudnetByTutor() {
    	
        super();
        System.out.println("in student servlet");
        studentDao = new StudentDao();
        adminServiceImpl = new AdminServiceImpl();
		
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	  	System.out.println("id : "+request.getParameter("tutorName"));
	  	Tutor tutor = studentDao.getTutor(Integer.parseInt(request.getParameter("tutorName")));
	  	
		
		Set<StudentTutorMapping> getStudentTutorList= adminServiceImpl.getStudentWithRespectToTutor(tutor);
	
		HttpSession session = request.getSession();
		request.setAttribute("getStudentTutorList", getStudentTutorList);
		
		RequestDispatcher  rd = request.getRequestDispatcher("view/admin/studenttutorlist.jsp");
		rd.forward(request, response);
	}
}
