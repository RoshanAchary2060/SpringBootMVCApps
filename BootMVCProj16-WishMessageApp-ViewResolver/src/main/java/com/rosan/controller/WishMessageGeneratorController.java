package com.rosan.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rosan.service.IWishMessageService;

@Controller
public class WishMessageGeneratorController {
	@Autowired
	private IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "home"; // Logical View Name
	}
	
	@RequestMapping("/wish")
	public String generateMessage(Map<String,Object> map) {
		String result = service.generateWishMessage();
		map.put("wMsg", result);
		return "display";
	} // non-invasive code so it is best
}
