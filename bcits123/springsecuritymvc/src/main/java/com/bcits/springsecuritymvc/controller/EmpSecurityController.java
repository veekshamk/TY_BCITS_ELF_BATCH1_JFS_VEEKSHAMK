package com.bcits.springsecuritymvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;
import com.bcits.springsecuritymvc.service.EmpService;

@Controller
public class EmpSecurityController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String getRegisterForm() {
		return "register";
	}
	
	@PostMapping("/register")
	public String register(EmpInfoBean empBean, ModelMap modelMap) {
		boolean isRegistered =service.register(empBean);
		
		if(isRegistered) {
			modelMap.addAttribute("msg", "Registered Successfully..");
		}else {
			modelMap.addAttribute("errMsg", "Registration Failed!!!");
		}
		return "register";
	}
	
	@GetMapping("/adminSecureHome")
	public String getAdminSecureHome() {
		return "adminHome";
	}
	
	@GetMapping("/userSecureHome")
	public String getUserSecureHome() {
		return "userHome";
	}
	
	@GetMapping("/getEmployeeForm")
	public String getEmployeeForm() {
		return "search";
	}
	
	@GetMapping("/getEmployee")
	public String getEmployee(int empId, ModelMap modelMap) {
		EmpInfoBean empBean = service.getEmployee(empId);
		modelMap.addAttribute("empBean", empBean);
		
		return "search";
	}
	
	@GetMapping("/getAllEmployees")
	public String getAllEmployees(ModelMap modelMap) {
		modelMap.addAttribute("employeeList", service.getAllEmployees());
		return "getAllEmployees";
	}
	
	
	
	
	
	
	
	
}
