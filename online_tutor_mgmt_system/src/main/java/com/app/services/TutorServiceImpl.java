package com.app.services;

import java.util.List;
import java.util.Set;

import com.app.dao.ITutorDao;
import com.app.dao.TutorDaoImpl;
import com.app.model.TrainingMaterial;
import com.app.model.Tutor;

public class TutorServiceImpl implements ITutorService {

	private TutorDaoImpl tutorDaoImpl;
	
	public TutorServiceImpl(){
		tutorDaoImpl = new TutorDaoImpl();
	}
	
	
	public Set<TrainingMaterial> getTrainingMaterialListByTutor(Tutor tutor) {
		// TODO Auto-generated method stub
		return tutorDaoImpl.getTrainingListByTutor(tutor);
	}

}
