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

import com.app.model.Student;
import com.app.services.AdminServiceImpl;
import com.app.services.IAdminService;



/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/getAllStudent")
public class GetAllStudnetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminServiceImpl adminServiceImpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllStudnetServlet() {
    	
        super();
        System.out.println("in student servlet");
        adminServiceImpl = new AdminServiceImpl();
		
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> studentList = adminServiceImpl.getAllStudent();
		
		HttpSession session = request.getSession();
		request.setAttribute("studentList", studentList);
		RequestDispatcher  rd = request.getRequestDispatcher("view/admin/studentlist.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
}
