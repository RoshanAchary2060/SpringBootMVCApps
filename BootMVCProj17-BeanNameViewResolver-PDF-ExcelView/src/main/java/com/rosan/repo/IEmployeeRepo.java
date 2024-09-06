package com.rosan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosan.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
