package com.nt.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {

//	@GetMapping("/data")
//	public String bindData(@RequestParam("sno") int no, @RequestParam("sname") String name) {
//		System.out.println(no + "," + name);
//		// return LVN
//		return "showdata";
//	}

//	@GetMapping("/data")
//	public String bindData(@RequestParam int sno, @RequestParam(required=false) String sname) {
//		System.out.println(sno + "," + sname);
//		// return LVN
//		return "showdata";
//	}

//	@GetMapping("/data")
//	public String bindData(@RequestParam(defaultValue="100", required=false) int sno, @RequestParam(defaultValue = "raja") String sname) {
//		System.out.println(sno + "," + sname);
//		// return LVN
//		return "showdata";
//	}

//	@GetMapping("/data")
//	public String bindData(@RequestParam(required = false) Integer sno,
//			@RequestParam(defaultValue = "raja") String[] sname 
//			,@RequestParam("sname") ArrayList<String> names
//			,@RequestParam("sname") Set <String> sets
//			) {
//		System.out.println(sno + "," + Arrays.toString(sname)+", " + names+", "+sets);
//		System.out.println(sets.getClass());
//		// return LVN
//		return "showdata";
//	}
	
	@GetMapping("/data")
	public String bindData(@RequestParam int sno, @RequestParam String sname) {
		System.out.println(sno + ", " + sname);
		// return LVN
		return "showdata";
	}
}
