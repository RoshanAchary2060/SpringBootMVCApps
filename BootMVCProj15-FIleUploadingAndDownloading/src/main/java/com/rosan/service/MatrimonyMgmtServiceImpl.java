package com.rosan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosan.entity.MarriageSeekerInfo;
import com.rosan.repo.IMarriageSeekerInfoRepo;

@Service("matrimonyService")
public class MatrimonyMgmtServiceImpl implements IMatrimonyMgmtService {
	@Autowired
	private IMarriageSeekerInfoRepo seekerRepo;

	@Override
	public String registerProfile(MarriageSeekerInfo entity) {
		return "Profile is registered with id :: " + seekerRepo.save(entity).getProfileId();

	}

	@Override
	public Iterable<MarriageSeekerInfo> getAllProfiles() {
		return seekerRepo.findAll();
	}
}
