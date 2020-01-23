package com.bcits.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bcits.springcore.annotations.beans.EmployeeBean;

@Configuration
public class EmployeeConfig {
	
	@Bean
	//@Scope("prototype")
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean=new EmployeeBean();
//		employeeBean.setName("Shravya");
//		employeeBean.setAge(34);
		
		return employeeBean;
	}

}
