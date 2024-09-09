package com.rosan.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rosan.model.Employee;
import com.rosan.service.IEmployeeMgmtService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/emp_report")
	public String showEmployeeRepo(Map<String, Object> map) {
		// use service
		Iterable<Employee> empList = service.getAllEmployees();
		map.put("empList", empList);
		// return lvn;
		return "employee_report";
	}

	@GetMapping("/insert_employee")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		// return LVN
		return "add_employee";
	}

	@PostMapping("/insert_employee")
	public String insertEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp) {
		// use service
		String result = service.insertEmployee(emp);
		// add result to RedirectAttributes attribute
		attrs.addFlashAttribute("result", result);
		// return LVN
		return "redirect:emp_report";
	}
//	@PostMapping("/insert_employee")
//	public String insertEmployee(HttpSession sess, @ModelAttribute("emp") Employee emp) {
//		// use service
//		String result = service.insertEmployee(emp);
//		// add result to session attribute
//		sess.setAttribute("result", result);
//		// return LVN
//		return "redirect:emp_report";
//	}

	@GetMapping("/edit_employee")
	public String showEditEmployeeFormPage(@RequestParam("empno") int no, @ModelAttribute("emp") Employee emp) {
		// use service
		Employee emp1 = service.getEmployeeByEno(no);
		BeanUtils.copyProperties(emp1, emp);
		// return lvn
		return "modify_employee";
	}

	@PostMapping("/edit_employee")
	public String editEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp) {
		// use service
		String result = service.updateEmployee(emp);

		// keep results in model attributes
		attrs.addFlashAttribute("result", result);

		// return LVN
		return "redirect:emp_report";
	}

	@GetMapping("/delete_employee")
	public String deleteEmployee(@RequestParam("empno") int no, RedirectAttributes attrs) {
		// use service
		String result = service.deleteEmployeeByEno(no);
		// add result to model attribute
		attrs.addFlashAttribute("result", result);
		// return LVN
		return "redirect:emp_report";
	}
}
