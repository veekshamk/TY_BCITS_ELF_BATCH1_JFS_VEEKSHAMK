package com.bcits.springcore.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class EmployeeBean {

	private String name;
	private int age;
	
	@Autowired(required=false)
	@Qualifier("acc")
	private DepartmentBean departmentBean;
	
//	@PostConstruct
//	public void init() {
//		System.out.println("Its Init phase..");
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Its Destruction phase..");
//	}


}
