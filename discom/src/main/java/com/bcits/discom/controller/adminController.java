package com.bcits.discom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bcits.discom.beans.AdminBean;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.service.AdminService;

@Controller
public class adminController {
	
	@Autowired
	private AdminService service;
	
	@GetMapping("/adminLogin")
	public String displayAdminLoginPage() {
		return "adminLoginPage";
	}
	
	@PostMapping("/adminHomePage") 
	public String adminLogin(String email, String password ,HttpServletRequest req ,ModelMap modelMap) {
		AdminBean adminBean = service. adminLogin(email, password);
		System.out.println(adminBean);
		if( adminBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInAdmin", adminBean);
			return "adminHome";
		}else {
			modelMap.addAttribute("errMsg", "Invalid Credentials!!");
			return "adminLoginPage";
		}		
	}

	@GetMapping("/adminHomePage")
	public String loginAdminPage() {
		return "adminHome";
	}
	
	@GetMapping("/addEmployee")
	public String displayAddEmployee() {
		return "addEmployeePage";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(HttpSession session, EmployeeMasterBean employeeBean, ModelMap modelMap) {
		AdminBean adminBean =(AdminBean) session.getAttribute("loggedInAdmin");
		if(adminBean !=null) {
			if(service.addEmployee(employeeBean)) {
				modelMap.addAttribute("msg", "Employee has been Added Successfully..");
				return "adminHome";
			}else {
				modelMap.addAttribute("errMsg", "Record Already Exists...");
				return "adminHome";
			}
		}else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "adminLoginPage";
		}
	}

	@GetMapping("/adminLogout")
	public String adminLogout(ModelMap modelMap, HttpSession session) {
		AdminBean adminBean = (AdminBean) session.getAttribute("loggedInAdmin");

		if(adminBean != null) {
			session.invalidate();
			modelMap.addAttribute("msg", "Successfully Logged Out..");
		}else {
			modelMap.addAttribute("errMsg", "Please Login First..");
		}
		return "adminLoginPage";
	}//End of consumerLogout()

}
