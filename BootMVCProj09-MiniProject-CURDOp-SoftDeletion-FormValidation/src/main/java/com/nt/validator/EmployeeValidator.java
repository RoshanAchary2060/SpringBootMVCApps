package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	// This method is given to check whether current handler method is passing
	// current class object or not
	// if passed, internally it calls validate() method otherwise throws exception
	public boolean supports(Class<?> clazz) {
		System.out.println("EmployeeValidator.supports()");
//		return Employee.class == clazz;
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("EmployeeValidator.validate()");
		// type casting
		Employee emp = (Employee) target;
		// server side form validation logic
		if (emp.getEname() == null || emp.getEname().isBlank()) {
			errors.rejectValue("ename", "emp.ename.required");
		} else if (emp.getEname().length() < 5) {
			errors.rejectValue("ename", "emp.ename.minlength");
		}

		if (emp.getJob() == null || emp.getJob().isBlank()) {
			errors.rejectValue("job", "emp.job.required");
		} else if (emp.getJob().length() < 5) {
			errors.rejectValue("job", "emp.job.minlength");
		}

		if (emp.getSal() == null) {
			errors.rejectValue("sal", "emp.sal.required");
		} else if (emp.getSal() < 1000 || emp.getSal() > 1000000) {
			errors.rejectValue("sal", "emp.sal.range");
		}

		if (emp.getDeptno() == null) {
			errors.rejectValue("deptno", "emp.deptno.required");
		} else if (emp.getDeptno() < 10 || emp.getDeptno() > 1000) {
			errors.rejectValue("sal", "emp.deptno.range");
		}
	}

}
