package com.bcits.discom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/employeeLoginPage")
	public String diaplayConsumerLoginPage() {
		return "employeeLogin";
	}

}
