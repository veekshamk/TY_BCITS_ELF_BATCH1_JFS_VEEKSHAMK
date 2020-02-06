package com.bcits.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringSecurityController {

	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}

	@GetMapping("/adminSecureHome")
	public String getAdminHomePage() {
		return "adminHome";
	}

	@GetMapping("/userSecureHome")
	public String getUserHomePage() {
		return "userHome";
	}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "loginForm";
	}
	
//	@PostMapping("/login")
//	public String loginSubmit() {
//		return "userHome";
//	}
}
