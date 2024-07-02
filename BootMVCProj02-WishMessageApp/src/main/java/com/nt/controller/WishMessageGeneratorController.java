package com.nt.controller;

import java.io.PrintWriter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class WishMessageGeneratorController {
	
	@Autowired
	private IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "home"; // Logical View Name
	}
	
//	@RequestMapping("/wish")
//	public String generateMessage(BindingAwareModelMap map) {
//		String result = service.generateWishMessage();
		
//		ModelAndView mav = new ModelAndView(); // like this we can add any no of model attributes
//		mav.addObject("wMsg", result);
//		mav.setViewName("display");
//		return mav;
//		return new ModelAndView("display", "wMsg", result); // here we can add only one model attribute
	
//		map.addAttribute("wMsg", result);
//		return "display";
//	}
	
//	@RequestMapping("/wish")
//	public String generateMessage(Map<String,Object> map) {
//		String result = service.generateWishMessage();
//		map.put("wMsg", result);
//		return "display";
//	} // non-invasive code so it is best
	
//	@RequestMapping("/wish")
//	public void generateMessage(Map<String,Object> map) {
//		String result = service.generateWishMessage();
//		map.put("wMsg", result);
//	}
	
//	@RequestMapping("/wish")
//	public Model generateMessage() {
//		String result = service.generateWishMessage();
//		//create model attributes
//		Model model = new ExtendedModelMap();
//		model.addAttribute("wMsg", result);
//		return model;
//	}
	
//	@RequestMapping("/wish")
//	public Map<String, Object> generateMessage(Map<String, Object> map) {
//		String result = service.generateWishMessage();
//		map.put("wMsg", result);
//		return map;
//	}
	
	@RequestMapping("/wish")		
	public void generateMessage(HttpServletResponse res) throws Exception{
		String result = service.generateWishMessage();
		// getPrintWriter pointing to response object
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<b>Wish Message is "+ result);
	}
}
