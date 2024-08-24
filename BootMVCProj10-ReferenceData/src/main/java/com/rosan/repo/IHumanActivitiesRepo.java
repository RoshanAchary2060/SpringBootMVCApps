package com.rosan.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rosan.model.HumanActivities;

public interface IHumanActivitiesRepo extends JpaRepository<HumanActivities, String> {
	@Query("select hobbies from HumanActivities")
	public Set<String> getAllHobbies();
}
