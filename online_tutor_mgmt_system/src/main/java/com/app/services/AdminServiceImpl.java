package com.app.services;

import java.util.List;
import java.util.Set;

import com.app.dao.AdminDaoImpl;
import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public class AdminServiceImpl implements IAdminService {
	
	private AdminDaoImpl adminDaoImpl;

	public AdminServiceImpl() {
		adminDaoImpl = new AdminDaoImpl();
	}
	public List<TrainingMaterial> getAllMaterialList() {
		
		return adminDaoImpl.getAllMaterialList();
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return adminDaoImpl.getAllStudent();
	}

	public List<Tutor> getAllTutor() {
		// TODO Auto-generated method stub
		return adminDaoImpl.getAllTutor();
	}

	public Set<StudentTutorMapping> getStudentWithRespectToTutor(Tutor tutor) {
		// TODO Auto-generated method stub
		return adminDaoImpl.getStudentWithRespectToTutor(tutor);
	}

}
