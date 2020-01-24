package com.bcits.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bcits.springmvc.beans.UserBean;

@Controller
public class SpringMVCController {
	@RequestMapping(path="/hello", method= RequestMethod.GET)
	public ModelAndView getWelcomeMessage() {
		ModelAndView modelAndView= new ModelAndView();
//		modelAndView.setViewName("WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}
	
	@RequestMapping(path="/searchEmployee", method= RequestMethod.GET)
	public ModelAndView searchEmployee(HttpServletRequest req) {
		String empIdVal=req.getParameter("empId");
		
		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.setViewName("WEB-INF/views/searchEmployee.jsp");
		modelAndView.setViewName("searchEmployee");
		req.setAttribute("empId", empIdVal);
		
		return modelAndView;
	}
	
	@RequestMapping(path="/loginForm", method= RequestMethod.GET)
	public ModelAndView displayLoginForm(ModelAndView modelAndView) {
//		modelAndView.setViewName("WEB-INF/views/loginForm.jsp");
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}
	
	//1st way of getting Form data
	@RequestMapping(path="/login1", method= RequestMethod.POST)
	public ModelAndView login1(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdVal=req.getParameter("empId");
		int empId=Integer.parseInt(empIdVal);
		String password=req.getParameter("password");
		
		modelAndView.addObject("empId", empId);
		modelAndView.addObject("pwd", password);
		
//		modelAndView.setViewName("WEB-INF/views/userDetails.jsp");
		modelAndView.setViewName("userDetails");
		
		return modelAndView;
	}
	
	//2nd way of getting Form data
	@PostMapping("/login2")
	public ModelAndView login2(@RequestParam(name="empId") int empId,
			@RequestParam(name="password") String password, ModelAndView modelAndView) {
		
		modelAndView.addObject("empId", empId);
		modelAndView.addObject("pwd", password);
//		modelAndView.setViewName("WEB-INF/views/userDetails.jsp");
		modelAndView.setViewName("userDetails");
		
		return modelAndView;
	}
	
	
	//3rd way of getting Form data
	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);
		
//		return "WEB-INF/views/userDetails.jsp";
		return "userDetails";
	}
	
	//4th way of getting Form data
	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("UserBean", userBean);
		
		/*return "/WEB-INF/views/userDetails2.jsp";*/
		return "userDetails2";
	}
	
	
	@PostMapping("/login5")
	public String login5(UserBean userBean, String name, ModelMap modelMap) {
		modelMap.addAttribute("UserBean", userBean);
		modelMap.addAttribute("name", name);
		
		//return "/WEB-INF/views/userDetails2.jsp"; //when view resolver is not configured
		return "userDetails2"; 
	}
}
