package com.bcits.discom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bcits.discom.beans.ConsumerMaster;
import com.bcits.discom.beans.EmployeeMaster;
import com.bcits.discom.service.ConsumerService;

@Controller
//@RequestMapping("/consumer")
public class ConsumerController {
	
//	@Autowired
//	private ConsumerService service;

	@GetMapping("/consumerSignUpPage")
	public String diaplayConsumerSignUpPage() {
		return "consumerSignUp";
	}

	@GetMapping("/consumerLoginPage")
	public String diaplayConsumerLoginPage() {
		return "consumerLogin";
	}
	
//	@GetMapping("/addEmpForm")
//	public String displayAddEmpForm(
//			@SessionAttribute(name="loggedInEmpInfo", required= false) 
//			ConsumerMaster consumerMaster, ModelMap modelMap) {
//
//		if(consumerMaster != null) {
//			return "addEmpForm";
//		}else {
//			modelMap.addAttribute("errMsg", "Please Login First..");
//			return "empLoginForm";
//		}
//	}
//
//	@PostMapping("/signUpPage")
//	public String addConsumer(ConsumerMaster consumerMaster, String pwd, ModelMap modelMap) {
//			if(service.consumerSignUp(consumerMaster, pwd)){
//				modelMap.addAttribute("msg", "Successfully SignedUp...");
//				return "consumerHome";
//			}else {
//				modelMap.addAttribute("errMsg", "Already Exists...");
//
//			}
//			return "consumerHome";
//		
//		}
	}



