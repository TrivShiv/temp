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
import com.app.model.TrainingMaterial;
import com.app.services.AdminServiceImpl;
import com.app.services.IAdminService;



/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/getAllMaterial")
public class GetAllTrainingMaterialListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminServiceImpl adminServiceImpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllTrainingMaterialListServlet() {
    	
        super();
        System.out.println("in student servlet");
        adminServiceImpl = new AdminServiceImpl();
		
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TrainingMaterial> materialList = adminServiceImpl.getAllMaterialList();
		
		HttpSession session = request.getSession();
		request.setAttribute("materialList", materialList);
		RequestDispatcher  rd = request.getRequestDispatcher("view/admin/materialList.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
}
