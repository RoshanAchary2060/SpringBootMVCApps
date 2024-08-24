package com.rosan.controller;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosan.model.Cricketer;
import com.rosan.service.ICricketerMgmtService;

@Controller
public class CricketerController {
	@Autowired
	private ICricketerMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/register")
	public String showCricketerRegistrationPage(@ModelAttribute("cktr") Cricketer cktr) {
		// return lvn
		return "cricketer_register";
	}

	@PostMapping("/register")
	public String registerCricketer(Map<String, Object> map, @ModelAttribute("cktr") Cricketer cktr,
			BindingResult errors) {

		// use service
		String msg = service.registerCricketer(cktr);
		// keep result as model attribute
		map.put("result", msg);
		// return lvn
		return "show_result";
	}

	@InitBinder
	public void myInitBinder(WebDataBinder binder) {
		System.out.println("CricketerController.myInitBinder()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(sdf, false); // ReadyMade PropertyEditor to convert String date
																	// value to java.util.Date class obj
		binder.registerCustomEditor(java.util.Date.class, editor);
	}
}
