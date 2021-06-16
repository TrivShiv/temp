package com.app.services;

import java.util.List;
import java.util.Set;

import com.app.model.Student;
import com.app.model.StudentTutorMapping;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public interface IAdminService {

	List<TrainingMaterial> getAllMaterialList();
	List<Student> getAllStudent();
	List<Tutor> getAllTutor();
	Set<StudentTutorMapping> getStudentWithRespectToTutor(Tutor tutor);
}
