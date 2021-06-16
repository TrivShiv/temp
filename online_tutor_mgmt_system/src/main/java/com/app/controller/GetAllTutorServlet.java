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
import com.app.model.Student;
import com.app.model.Tutor;
import com.app.services.AdminServiceImpl;
import com.app.services.IAdminService;



/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/getAllTutor")
public class GetAllTutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminServiceImpl adminServiceImpl;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllTutorServlet() {
    	
        super();
        adminServiceImpl = new AdminServiceImpl();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Tutor> tutorList = adminServiceImpl.getAllTutor();
		 HttpSession session = request.getSession();
			request.setAttribute("tutorList", tutorList);
			RequestDispatcher  rd = request.getRequestDispatcher("view/admin/tutorlist.jsp");
			rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
}
