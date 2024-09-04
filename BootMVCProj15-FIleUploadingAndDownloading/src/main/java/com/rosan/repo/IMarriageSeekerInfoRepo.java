package com.rosan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosan.entity.MarriageSeekerInfo;

public interface IMarriageSeekerInfoRepo extends JpaRepository<MarriageSeekerInfo, Integer> {
	
}
