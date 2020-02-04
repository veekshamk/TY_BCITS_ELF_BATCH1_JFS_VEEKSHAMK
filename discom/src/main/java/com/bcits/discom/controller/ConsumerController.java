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

import com.bcits.discom.beans.BillHistoryBean;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.MonthlyConsumptionBean;
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
		return "mainHome";
	}
	
	@GetMapping("/aboutUs")
	public String diaplayAboutUsPage() {
		return "aboutUs";
	}

	@PostMapping("/signUpPage")
	public String add(ConsumerMasterBean consumerBean, String cpassword, ModelMap map) {

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
		ConsumerMasterBean consumerInfo=(ConsumerMasterBean) session.getAttribute("loggedInCons");
		System.out.println(consumerInfo);
		if(consumerInfo != null) {
			CurrentBillBean bill=service.generateCurrentBill(consumerInfo.getRrNumber());

			if(bill != null) {
				modelMap.addAttribute("generatedBill", bill);
				return "currentBill";
			}else {
				modelMap.addAttribute("errMsg", "Bill Not Generated..");
				return "consumerHome";
			}
		}else {
			modelMap.addAttribute("errMsg", "Please Login First...");
			return "consumerLogin";
		}
	}

	@GetMapping("/monthlyConsumption")
	public String displayMonthlyConsumption(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMasterBean=(ConsumerMasterBean) session.getAttribute("loggedInCons");
		if(consumerMasterBean !=null) {
			List<MonthlyConsumptionBean> monthlyList=service.showMonthlyConsumption(consumerMasterBean.getRrNumber());
			if(monthlyList != null) {
				modelMap.addAttribute("consumption", monthlyList);
				return "monthlyConsumption";
			}else {
				modelMap.addAttribute("errMsg", "Error...");
				return "consumerHome";
			}
		}else {
			modelMap.addAttribute("errMsg", "Please Login First...");
			return "consumerLogin";
		}
	}

	@GetMapping("/billHistory")
	public String displayBillHistory(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMaster=(ConsumerMasterBean) session.getAttribute("loggedInCons");
		if(consumerMaster != null) {
			List<BillHistoryBean> billHistory=service.showBillHistory(consumerMaster.getRrNumber());
			if(billHistory !=null) {
				modelMap.addAttribute("history", billHistory);
				return "billHistory";
			}else {
				modelMap.addAttribute("errMsg", "Error");
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

	@GetMapping("/payment")
	public String displayPaymentPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean masterBean=(ConsumerMasterBean) session.getAttribute("loggedInCons");

		if(masterBean !=null) {
			return "payment";
		}else {
			modelMap.addAttribute("errMsg", "Please Login First!...");
			return "consumerLogin";
		}
	}

	@PostMapping("/successPayment")
	public String successfullPayment(HttpSession session, ModelMap modelMap, double amount) {
		ConsumerMasterBean masterBean=(ConsumerMasterBean) session.getAttribute("loggedInCons");
		Date date= new Date();

		if(masterBean !=null) {
			System.out.println(date);
			System.out.println(masterBean.getRrNumber()); 
			System.out.println(amount);

			boolean payment=service.payment(masterBean.getRrNumber(), date, amount);
				System.out.println(payment);

				if(payment == true) {
					modelMap.addAttribute("msg", "Payment Successfull..");
					return "consumerHome";
				}else {
					modelMap.addAttribute("errMsg", "Payment Failed..");
					return "payment";
				}
			}else {
				return "consumerLogin";
			}
	}
}
	



