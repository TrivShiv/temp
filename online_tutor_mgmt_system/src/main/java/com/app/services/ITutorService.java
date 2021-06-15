package com.app.services;

import java.util.List;
import java.util.Set;

import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public interface ITutorService {

	Set<TrainingMaterial> getTrainingMaterialListByTutor(Tutor tutor);
//	List<TrainingMaterial> getAllTrainingMaterialByTutorId(int id);
}
