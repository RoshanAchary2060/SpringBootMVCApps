package com.rosan.service;

import com.rosan.model.Employee;

public interface IEmployeeMgmtService {
	public Iterable<Employee> getAllEmployees();

	public String insertEmployee(Employee e);
	
	public Employee getEmployeeByEno(int eno);
	
	public String updateEmployee(Employee e);

	public String deleteEmployeeByEno(int eno);
}
