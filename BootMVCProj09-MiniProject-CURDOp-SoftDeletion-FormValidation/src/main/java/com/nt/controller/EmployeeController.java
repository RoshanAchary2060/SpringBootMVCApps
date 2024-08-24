package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeValidator validator;

	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

//	@GetMapping("/emp_report")
//	public String showEmployeeReport(Map<String, Object> map) {
//		// use service
//		Iterable<Employee> empList = service.getAllEmployees();
//		map.put("empList", empList);
//		// return lvn;
//		return "employee_report";
//	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(
			@PageableDefault(page = 0, size = 3, sort = "job", direction = Sort.Direction.ASC) Pageable pageable,
			Map<String, Object> map) {
		// use service
		Page<Employee> page = service.getEmployeesPageData(pageable);

		// keep result as model attribute
		map.put("pageData", page);
		// return LVN;
		return "employee_report";
	}

	@GetMapping("/insert_employee")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		// return LVN
		return "add_employee";
	}

	@PostMapping("/insert_employee")
	public String insertEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp, BindingResult errors) {
		// enable server side form validations only when client side form validations
		// are not done
		if (emp.getVflag().equalsIgnoreCase("no")) {
			if (validator.supports(emp.getClass())) {
				validator.validate(emp, errors);
				if (errors.hasErrors()) {
					return "add_employee";
				}
			}
		}

		// Application or business logic errors
		if (emp.getJob().equalsIgnoreCase("PRESIDENT") || emp.getJob().equalsIgnoreCase("QUEEN")) {
			errors.rejectValue("job", "emp.job.restriction");
			return "add_employee";
		}

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
	public String showEditEmployeeFormPage(@RequestParam("eno") int no, @ModelAttribute("emp") Employee emp) {
		// use service
		Employee emp1 = service.getEmployeeByEno(no);
		BeanUtils.copyProperties(emp1, emp);
		// return lvn
		return "modify_employee";
	}

	@PostMapping("/edit_employee")
	public String editEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp, BindingResult errors) {
		// enable server side form validations only when client side form validations
		// are not done
		if (emp.getVflag().equalsIgnoreCase("no")) {
			if (validator.supports(emp.getClass())) {
				validator.validate(emp, errors);
				if (errors.hasErrors()) {
					return "modify_employee";
				}
			}
		}

		// Application or business logic errors
		if (emp.getJob().equalsIgnoreCase("PRESIDENT") || emp.getJob().equalsIgnoreCase("QUEEN")) {
			errors.rejectValue("job", "emp.job.restriction");
			return "modify_employee";
		}
		// use service
		String result = service.updateEmployee(emp);

		// keep results in model attributes
		attrs.addFlashAttribute("result", result);

		// return LVN
		return "redirect:emp_report";
	}

	@GetMapping("/delete_employee")
	public String deleteEmployee(@RequestParam("eno") int no, RedirectAttributes attrs) {
		// use service
		String result = service.deleteEmployeeByEno(no);
		// add result to model attribute
		attrs.addFlashAttribute("result", result);
		// return LVN
		return "redirect:emp_report";
	}
}
