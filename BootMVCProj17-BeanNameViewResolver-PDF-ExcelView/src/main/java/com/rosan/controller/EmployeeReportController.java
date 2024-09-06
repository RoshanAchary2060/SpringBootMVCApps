package com.rosan.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rosan.model.Employee;
import com.rosan.service.IEmployeeMgmtService;

@Controller
public class EmployeeReportController {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String generateReport(@RequestParam("type") String type, Map<String, Object> map) {
		// use service
		Iterable<Employee> empList = service.getAllEmployees();
		// add to model attribute
		map.put("empList", empList);
		// return LVN
		if(type.equalsIgnoreCase("pdf")) {
			return "pdf_report";
		} else {
			return "excel_report";
		}
	}
}
