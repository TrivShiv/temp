package com.app.dao;

import java.util.List;
import java.util.Set;

import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public interface IAdminDao {
	
//	view all material 
//    5)view student with respective tutor(graph)
//    6)delete tutor or student if finds falsy data

	
	List<TrainingMaterial> getAllMaterialList();
	List<Student> getAllStudent();
	List<Tutor> getAllTutor();
	Set<StudentTutorMapping> getStudentWithRespectToTutor(Tutor tutor);
	
}
