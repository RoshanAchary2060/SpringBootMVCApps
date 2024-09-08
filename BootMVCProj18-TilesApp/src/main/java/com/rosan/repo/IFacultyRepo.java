package com.rosan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosan.model.Faculty;

public interface IFacultyRepo extends JpaRepository<Faculty, Integer> {

}
