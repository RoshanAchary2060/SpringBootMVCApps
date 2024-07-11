package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	private Integer eno;
	private String ename;
	private String eaddrs="hyd";
	private double esalary=9000;

	public Employee() {
		System.out.println("Employee.Employee()");
	}
}
