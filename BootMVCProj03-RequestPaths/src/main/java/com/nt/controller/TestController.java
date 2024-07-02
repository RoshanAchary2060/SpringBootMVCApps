package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private ServletContext ctx;
	@Autowired
	private ServletConfig cfg;

//	@RequestMapping("/REPORT")
//	public String showReport(Map<String, Object> map) {
//		System.out.println("TestController.showReport()");
//		return "display1";
//	}
//
//	@RequestMapping("/report")
//	public String showReport1(Map<String, Object> map) {
//		System.out.println("TestController.showReport()1");
//		return "display2";
//	}
	
//	@RequestMapping("/")
//	@RequestMapping
//	public String showHome() {
//		return "home";
//	}
	
	@GetMapping
	public String showHome() {
		return "home";
	}
	

	
	@GetMapping("/report")
//	@RequestMapping(value="/report",method=RequestMethod.GET)
	public String showReport(Map<String, Object> map) {
		System.out.println("TestController.showReport()");
		System.out.println("web app name:" + ctx.getContextPath());
		System.out.println("Ds logical name: " + cfg.getServletName());
		
		return "display1";
	}
	
//	@GetMapping(value={"/report","/report1"})
//	public String showReport(Map<String, Object> map) {
//		System.out.println("TestController.showReport()");
//		return "display1";
//	}
	
//	@PostMapping("/report")
////	@RequestMapping(value="/report",method=RequestMethod.POST)
//	public String showReport1(Map<String, Object> map) {
//		System.out.println("TestController.showReport1()");
//		return "display2";
//	}
}
