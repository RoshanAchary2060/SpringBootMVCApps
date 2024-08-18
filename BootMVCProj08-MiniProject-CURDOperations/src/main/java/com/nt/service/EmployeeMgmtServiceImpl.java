package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepo.findAll(Sort.by("job").ascending());
	}

	@Override
	public String insertEmployee(Employee e) {
		return "Employee inserted with id value :: " + empRepo.save(e).getEmpno();
	}

	@Override
	public Employee getEmployeeByEno(int eno) {
		return empRepo.findById(eno).get();
	}

	@Override
	public String updateEmployee(Employee e) {

		return "Employee updated with id value :: " + empRepo.save(e).getEmpno();
	}

	@Override
	public String deleteEmployeeByEno(int eno) {
		empRepo.deleteById(eno);
		return "Employee with id :: " + eno + " deleted";
	}

}
