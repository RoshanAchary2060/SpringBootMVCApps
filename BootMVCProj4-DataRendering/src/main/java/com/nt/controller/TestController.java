package com.nt.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;

@Controller
public class TestController {
	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		// add model attributes (simple values)
		map.put("name", "raja");
		map.put("age", 20);
		map.put("address", "hyd");

		String[] nickNames = { "raja", "jani", "ramesh", "suresh" };

		Set<Long> mobilePhonesSet = new HashSet<Long>();
		mobilePhonesSet.add(99999999L);
		mobilePhonesSet.add(88888888L);

		List<String> coursesList = List.of("java", "spring", "springboot", "hibernate");

		Map<String, Long> idsMap = Map.of("aadhar", 666666l, "voterid", 5454666L, "panNo", 898989L);
		// create model attributes
		map.put("nickNames", nickNames);
		map.put("phonesInfo", mobilePhonesSet);
		map.put("coursesList", coursesList);
		map.put("idsMap", idsMap);

		List <Employee> empList = List.of(new Employee(101,"Raja","Clerk",90000.0)
				, new Employee(102,"Rajesh","Engineer",190000.0));

		map.put("empInfo", empList);
		
		Employee emp = new Employee(103,"Rndai","Hacker",9999999.0);
		map.put("emp", emp);
		// return LVN;
		return "show_report";
	}
}