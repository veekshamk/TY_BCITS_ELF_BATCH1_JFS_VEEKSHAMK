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

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.beans.MonthlyConsumptionBean;
import com.bcits.discom.beans.QueryMessageBean;
import com.bcits.discom.dao.MailGeneration;
import com.bcits.discom.service.ConsumerService;
import com.bcits.discom.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@Autowired
	private ConsumerService consumerService;
	
	private MailGeneration mailGeneration = new MailGeneration();

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}//End of initBinder()

	@GetMapping("/employeeLoginPage")
	public String diaplayEmployeeLoginPage() {
		return "employeeLogin";
	}//End of diaplayEmployeeLoginPage()

	@PostMapping("/empLoginPage")
	public String adminLogin(int empId, String password, HttpServletRequest req, ModelMap modelMap) {
		EmployeeMasterBean employeeBean = empService.employeeLogin(empId, password);

		if (employeeBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInEmployee", employeeBean);
			modelMap.addAttribute("msg", "Login Successfull.");
			return "employeeHome";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credentials.");
			return "employeeLogin";
		}
	}//End of adminLogin()

	@GetMapping("/consumerList")
	public String consumerList(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if (employeeBean != null) {
			String region = employeeBean.getRegion();
			List<ConsumerMasterBean> consumerList = empService.showAllConsumers(region);
			if (!consumerList.isEmpty()) {
				modelMap.addAttribute("consumer", consumerList);
			} else {
				modelMap.addAttribute("errMsg", "Record Not Exists.");
			}
			return "consumerList";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First!");
			return "employeeLogin";
		}
	}//End of consumerList()

	@GetMapping("/billGeneratePage")
	public String displayBillGenerationPage(String rrNumber, ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if (employeeBean != null) {
			ConsumerMasterBean consumerBean = consumerService.getConsumer(rrNumber);
			long initial = consumerService.getInitialReading(rrNumber);

			if (consumerBean != null) {
				modelMap.addAttribute("consumerBean", consumerBean);
				modelMap.addAttribute("initial", initial);
			}
			return "billGenerationPage";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credentials...");
			return "employeeLogin";
		}
	}//End of displayBillGenerationPage()

	@PostMapping("/billGeneration")
	public String generateBill(ModelMap modelMap, HttpSession session, CurrentBillBean currentBill) {
		System.out.println(currentBill);
		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");


		if (employeeBean != null) {
			empService.addCurrentBill(currentBill);
				ConsumerMasterBean consumerBean = consumerService.getConsumer(currentBill.getRrNumber());
				mailGeneration.sendMail(currentBill, consumerBean);
			modelMap.addAttribute("msg", "Bill Generated..");
			return "billGenerate";
		} else {
			modelMap.addAttribute("msg", "Bill not Generated..");
			return "employeeLogin";
		}
	}//End of generateBill()

	@GetMapping("/generatePage")
	public String displayGenerationPage(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if (employeeBean != null) {
			String region = employeeBean.getRegion();
			List<ConsumerMasterBean> consumerList = empService.showAllConsumers(employeeBean.getRegion());
			if (consumerList != null && !consumerList.isEmpty()) {
				modelMap.addAttribute("consumer", consumerList);
			} else {
				modelMap.addAttribute("errMsg", "Record Not Exists.");
			}
			return "billGenerate";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First!");
			return "employeeLogin";
		}
	}//End of displayGenerationPage()

	@GetMapping("/listOfBills")
	public String listOfBills(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if (employeeBean != null) {
			List<MonthlyConsumptionBean> billList = consumerService.getAllBills(employeeBean.getRegion());
			if (billList != null && !billList.isEmpty()) {
				modelMap.addAttribute("bill", billList);
			} else {
				modelMap.addAttribute("errMsg", "Record Not Exists.");
			}
			return "showAllBills";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First!");
			return "employeeLogin";
		}
	}//End of listOfBills()
	
	@GetMapping("/employeeLogout")
	public String employeeLogout(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeBean = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		
		if(employeeBean != null) {
			session.invalidate();
			modelMap.addAttribute("msg", "Successfully Logged Out..");
		}else {
			modelMap.addAttribute("errMsg", "Please Login First..");
		}
		return "mainHome";
	}//End of employeeLogout()
	
	@GetMapping("/seeQueryDetails")
	public String diplayQueryDetails(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if(empInfo != null) {
			List<QueryMessageBean> queryList = empService.getQueryList(empInfo.getRegion());
			if(queryList != null && !queryList.isEmpty()) {
				modelMap.addAttribute("query",queryList);
			} else {
				modelMap.addAttribute("errMsg","No queries....");
			}
			return "queryListPage";
		}else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
	}//End of diplayQueryDetails()
	
	@PostMapping("/sendResponse")
	public String addResponses(ModelMap modelMap, HttpSession session,String rrNumber,String query ,Date date) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("loggedInEmployee");
		if(empInfo != null) {
			List<QueryMessageBean> queryList = empService.getQueryList(empInfo.getRegion());
					
			modelMap.addAttribute("query",queryList);
			if(empService.sendRespond(rrNumber, query, date)) {
				modelMap.addAttribute("msg","Sent");
			}
			return "queryListPage";
		}else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
	}//End of addResponses()
	
}
