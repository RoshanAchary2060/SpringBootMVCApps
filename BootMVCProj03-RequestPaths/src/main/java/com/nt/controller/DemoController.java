package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/demo")
public class DemoController {
//	@Autowired
//	private ServletContext ctx;
//	@Autowired
//	private ServletConfig cfg;
//	@Autowired
//	private HttpSession sess;
	
	@GetMapping("/report")
	public String generateReport(Map<String, Object> map, HttpSession sess) {
		System.out.println("DemoController.generateReport()");
//		System.out.println("web app name:" + ctx.getContextPath());
//		System.out.println("Ds logical name: " + cfg.getServletName());
		System.out.println("Session id: "+ sess.getId());
		return "display1";
	}
}
