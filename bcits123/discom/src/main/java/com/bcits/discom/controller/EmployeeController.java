package com.bcits.discom.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcits.discom.beans.AdminBean;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.service.ConsumerService;
import com.bcits.discom.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	private ConsumerService consumerService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	
	@GetMapping("/adminLoginPage")
	public String diaplayAdminLoginPage() {
		return "adminLogin";
	}

	@GetMapping("/employeeLoginPage")
	public String diaplayEmployeeLoginPage() {
		return "employeeLogin";
	}

//	@PostMapping("/empLoginPage")
//	public String displayEmployeeHomePage(ModelMap modelMap, HttpSession session) {
//		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
//		long noc = service.numOfConsumer(employeeBean.getRegion());
//		if(employeeBean !=null) {
//			modelMap.addAttribute("noc", noc);
//			return "employeeHome";
//		}
//		return "employeeLogin";
//	}
	
	
	@PostMapping("/empLoginPage")
	public String adminLogin(int empId, String password, HttpServletRequest req, ModelMap modelMap) {
		EmployeeMasterBean employeeBean=empService.employeeLogin(empId, password);
		
		if(employeeBean != null) {
			HttpSession session =req.getSession(true);
			session.setAttribute("loggedInEmployee", employeeBean);
			modelMap.addAttribute("msg", "Login Successfull.");
			return "employeeHome";
		}else {
			modelMap.addAttribute("errMsg", "Invalid Credentials.");
			return "employeeLogin";
		}
	}
	
	@GetMapping("/consumerList")
	public String consumerList(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean employeeBean =(EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if(employeeBean != null) {
			String region =employeeBean.getRegion();
			List<ConsumerMasterBean> consumerList = empService.showAllConsumers(region);
			if(!consumerList.isEmpty()) {
				modelMap.addAttribute("consumer", consumerList);
			}else {
				modelMap.addAttribute("errMsg", "Record Not Exists.");
			}
			return "consumerList";
		}else {
			modelMap.addAttribute("errMsg", "Please Login First!");
			return "employeeLogin";
		}
	}

	@GetMapping("/billGenerationPage")
	public String displayBillGenerationPage(String rrNumber, ModelMap modelMap, HttpSession session) {
		System.out.println(rrNumber);
		EmployeeMasterBean employeeBean =(EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		System.out.println(employeeBean);
		if(employeeBean != null) {
			ConsumerMasterBean consumerBean = consumerService.
		}
	}

}
