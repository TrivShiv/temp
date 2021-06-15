package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.app.model.StudentTutorMapping;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;
import com.app.services.ITutorService;
import com.app.services.TutorServiceImpl;


/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/materialDetails")
public class materialDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TutorServiceImpl tutorServiceImpl; 
	private StudentDao studentDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public materialDetailsServlet() {
    	
        super();
        tutorServiceImpl = new TutorServiceImpl();
        studentDao = new StudentDao();
        System.out.println("in material servlet");
		
		
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.print("hi form material id : "+request.getParameter("id"));
//		System.out.println("tutor id : "+request.getParameter("id"));
//		
//		List<TrainingMaterial> listOfMaterial = tutorServiceImpl.getAllTrainingMaterialByTutorId(Integer.parseInt(request.getParameter("id")));
//		System.out.println(listOfMaterial);
//		pw.print(listOfMaterial);
//		
//		
//		
//		request.setAttribute("materialList", listOfMaterial);
//		RequestDispatcher  rd = request.getRequestDispatcher("view/student/studentDashboard.jsp");
//		rd.forward(request, response);
		
		Tutor tutor = studentDao.getTutor(Integer.parseInt(request.getParameter("id")));
		Set<TrainingMaterial> trainingMaterialList = tutorServiceImpl.getTrainingMaterialListByTutor(tutor);
//		trainingMaterialList.forEach(m->System.out.println(m.getMaterialId()));
		
//		pw.print(trainingMaterialList);
		HttpSession session = request.getSession();
		
		session.setAttribute("tutor_detail", tutor);
		request.setAttribute("materiallist", trainingMaterialList );
		request.setAttribute("tutorId", tutor.getTutorId());
		RequestDispatcher rd = request.getRequestDispatcher("materiallist.jsp");
		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
