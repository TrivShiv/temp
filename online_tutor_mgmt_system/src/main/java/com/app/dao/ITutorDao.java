package com.app.dao;

import java.util.List;
import java.util.Set;

import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public interface ITutorDao {

	Set<TrainingMaterial> getTrainingListByTutor(Tutor tutor);
	List<TrainingMaterial> getAllTrainingMaterialByTutorId(int id);
	
}
