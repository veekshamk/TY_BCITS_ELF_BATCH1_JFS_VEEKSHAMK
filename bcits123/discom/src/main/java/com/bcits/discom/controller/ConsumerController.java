package com.bcits.discom.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.service.ConsumerService;

@Controller
public class ConsumerController {

	@Autowired
	private ConsumerService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/consumerSignUpPage")
	public String diaplayConsumerSignUpPage() {
		return "consumerSignUp";
	}

	@GetMapping("/consumerLoginPage")
	public String diaplayConsumerLoginPage() {
		return "consumerLogin";
	}

	@GetMapping("/homePage")
	public String diaplayHomePage() {
		return "welcomeHome";
	}

	@PostMapping("/signUpPage")
	public String add(ConsumerMasterBean consumerBean, String cpassword, ModelMap map) {
	
		//boolean x=service.consumerSignUp(consumerBean, cpassword);
		//System.out.println(x);
		if(service.consumerSignUp(consumerBean, cpassword)) {
			map.addAttribute("msg", "Signup success...");
			return "consumerLogin";
		} else { 
			map.addAttribute("errMsg", "already exists...");
		}  

		return "consumerLogin";
	}

	@PostMapping("/loginPage") 
	public String ConsumerLogin(String email, String password ,HttpServletRequest req ,ModelMap modelMap) {
		ConsumerMasterBean consumerInfoBean = service. consumerLogin(email, password);
		if( consumerInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInCons", consumerInfoBean);
			return "consumerHome";
		}else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "consumerLogin";
		}		
	}

	@GetMapping("/consumerBillDisplay")
	public String displayCurrentBillPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMasterBean=(ConsumerMasterBean) session.getAttribute("loggedInCons");
		System.out.println(consumerMasterBean);
		if(consumerMasterBean!=null) {
			System.out.println(consumerMasterBean.getRrNumber());
			CurrentBillBean bill=service.generateCurrentBill(consumerMasterBean.getRrNumber());
			System.out.println(bill);
			if(bill!=null) {
				modelMap.addAttribute("generatedBill",bill);
				return "currentBill";
			}else {
				modelMap.addAttribute("errMsg", "Bill Not Generated");
				return "consumerHome";
			}
		}else {
			modelMap.addAttribute("errMsg", "Please Login First...");
			return "consumerLogin";
		}
	}
	

	@GetMapping("/consumerLogoutPage")
	public String consumerLogOut(ModelMap modelMap, HttpSession session) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "You Are Sucessfully Logged Out !!");
		return "welcomeHome";
	}


	@GetMapping("/consumerHomePage")
	public String displayCustomerHomePage() {
		return "consumerHome";
	}

	@GetMapping("/paymentPage")
	public String displayPaymentPage() {
		return "payment";
	}

}



