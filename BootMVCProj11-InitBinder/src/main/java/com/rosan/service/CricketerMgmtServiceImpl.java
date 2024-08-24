package com.rosan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosan.model.Cricketer;
import com.rosan.repo.ICricketerRepo;

@Service
public class CricketerMgmtServiceImpl implements ICricketerMgmtService {
	@Autowired
	ICricketerRepo cRepo;

	@Override
	public String registerCricketer(Cricketer cricketer) {
		return "Cricketer is registered with " + cRepo.save(cricketer).getCid();
	}

}
