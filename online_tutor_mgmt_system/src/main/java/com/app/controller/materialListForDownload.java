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
import com.app.dao.TutorDaoImpl;
import com.app.model.Role;
import com.app.model.Student;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;
import com.app.services.StudentServiceImpl;
import com.app.services.TutorServiceImpl;
import com.app.services.UserServiceImpl;

/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/materialListDownload")
public class materialListForDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentServiceImpl studentServiceImpl;
	private StudentDao studentdaoImpl;
	private TutorDaoImpl tutorDao;
	private UserServiceImpl userServiceImpl;
	private TutorServiceImpl tutorServiceImpl; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public materialListForDownload() {
    	
        super();
        System.out.println("in material download servlet");
		
		studentServiceImpl = new StudentServiceImpl();
		studentdaoImpl = new StudentDao();
		tutorDao= new TutorDaoImpl();
		userServiceImpl = new UserServiceImpl();
		tutorServiceImpl = new TutorServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		List<Tutor> listOfTutor=studentServiceImpl.getAllTutors();
//		
//		request.setAttribute("tutorList", listOfTutor);
//		RequestDispatcher rd = request.getRequestDispatcher("view/Student/StudentDashboard.jsp");
//		rd.forward(request, response);
		
		System.out.println("tutor id for download material : "+request.getParameter("id"));
		Tutor tutor = studentServiceImpl.getTutor(Integer.parseInt(request.getParameter("id")));
		Set<TrainingMaterial> trainingMaterialList = tutorServiceImpl.getTrainingMaterialListByTutor(tutor);
//		trainingMaterialList.forEach(m->System.out.println(m.getMaterialId()));
		
//		pw.print(trainingMaterialList);
		HttpSession session = request.getSession();
		
		session.setAttribute("tutor_detail", tutor);
		request.setAttribute("materialdownloadlist", trainingMaterialList );
		request.setAttribute("tutorId", tutor.getTutorId());
		RequestDispatcher rd = request.getRequestDispatcher("materialdowloadlist.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println(request.getParameter("usrname"));
//		System.out.println(request.getParameter("usremail"));
//		System.out.println(request.getParameter("usrpwd"));
//		System.out.println(request.getParameter("role"));
		
//		
//		if(request.getParameter("role").equals("student"))
//		{
//			Student student = userServiceImpl.getStudent(Integer.parseInt(request.getParameter("usrid")));
////			String msg =  studentServiceImpl.registerUser(new Student(request.getParameter("studname"),request.getParameter("email"),request.getParameter("password"),Role.valueOf(request.getParameter("role").toUpperCase())));
////			System.out.println(""+student);
//			if(student != null) {
//				List<Tutor> listOfTutor=studentServiceImpl.getAllTutors();
////				System.out.println(listOfTutor);
//				
//				HttpSession session = request.getSession();
//				session.setAttribute("student_name", student.getStudName());
//				session.setAttribute("student_id", student.getStudId());
//				session.setAttribute("stud_detail", student);
//				
//				request.setAttribute("tutorList", listOfTutor);
//				RequestDispatcher  rd = request.getRequestDispatcher("view/student/studentDashboard.jsp");
//				rd.forward(request, response);
//			
//				
//			
//			}
//			String student = userServiceImpl.validateStudent(request.getParameter("usrname"),request.getParameter("usrpwd"));
////			String msg =  studentServiceImpl.registerUser(new Student(request.getParameter("studname"),request.getParameter("email"),request.getParameter("password"),Role.valueOf(request.getParameter("role").toUpperCase())));
//			System.out.println(""+student);
//			if(student.equals("request.getParameter('usrname')")) {
//				RequestDispatcher  rd = request.getRequestDispatcher("view/student/studentDashboard.jsp");
//				rd.forward(request, response);
//			}
//			if(student != null) {
//				RequestDispatcher  rd = request.getRequestDispatcher("view/student/studentDashboard.jsp");
//				rd.forward(request, response);
//			}
		}
//		if(request.getParameter("role").equals("tutor")) {
////			String msg =  tutorDao.registerUser(new Tutor(request.getParameter("studname"),request.getParameter("email"),request.getParameter("password"),Role.valueOf(request.getParameter("role").toUpperCase())));
////			System.out.println("msg : "+msg);
////			Tutor tutor = userServiceImpl.validateTutor(request.getParameter("usrname"),request.getParameter("usrpwd"));
////			String msg =  studentServiceImpl.registerUser(new Student(request.getParameter("studname"),request.getParameter("email"),request.getParameter("password"),Role.valueOf(request.getParameter("role").toUpperCase())));
//			Tutor tutor = userServiceImpl.getTutor(Integer.parseInt(request.getParameter("usrid")));
//
////			System.out.println(""+tutor);
//			if(tutor != null) {
//				RequestDispatcher  rd = request.getRequestDispatcher("view/tutor/tutorDashboard.jsp");
//				rd.forward(request, response);
//			}
//		}
		
//		String msg =  studentServiceImpl.registerUser(new Student(request.getParameter("studname"),request.getParameter("email"),request.getParameter("password"),Role.valueOf(request.getParameter("role").toUpperCase())));
//		System.out.println("msg : "+msg);
//		request.setAttribute("message", new String(msg));
//		RequestDispatcher  rd = request.getRequestDispatcher("view/admin/validate.jsp");
//		rd.forward(request, response);
		
		
//		 Student student =  studentdaoImpl.getStudent(Integer.parseInt(request.getParameter("studId")));
//			System.out.println(student);
////			
//		Tutor tutor =  studentdaoImpl.getTutor(Integer.parseInt(request.getParameter("tutorId")));
//			System.out.println(tutor);
//			
//			String msg = studentdaoImpl.addStudent(student, tutor);
//			System.out.println("msg from servlet : "+msg);	
		
		
		
	

}
