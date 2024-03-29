package com.bcits.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {

	@GetMapping("/cookiePage")
	public String getCookiePage() {
		return "cookiePage";
	}

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie myCookie=new Cookie("empName", "Vidya");
		resp.addCookie(myCookie);

		modelMap.addAttribute("msg", "Cookie Created Successfully...");
		return "cookiePage";
	}

	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="empName", required=false) String employeeName, ModelMap modelMap) {
		if(employeeName!=null) {
			modelMap.addAttribute("msg", "Cookie Value is "+employeeName);
		}else {
			modelMap.addAttribute("errMsg", "Cookie not Present!..");
		}
		return "cookiePage";
	}
}
