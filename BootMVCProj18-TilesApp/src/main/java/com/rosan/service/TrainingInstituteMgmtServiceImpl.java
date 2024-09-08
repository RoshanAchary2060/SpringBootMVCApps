package com.rosan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosan.model.Faculty;
import com.rosan.repo.IFacultyRepo;

@Service
public class TrainingInstituteMgmtServiceImpl implements ITrainingInstituteMgmtService {

	@Autowired
	private IFacultyRepo fRepo;

	@Override
	public Iterable<Faculty> getAllFaculties() {
		return fRepo.findAll();
	}

}
