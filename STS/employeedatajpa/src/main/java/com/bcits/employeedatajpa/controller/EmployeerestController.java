package com.bcits.employeedatajpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcits.employeedatajpa.beans.EmployeeInfoBean;
import com.bcits.employeedatajpa.beans.EmployeeResponse;
import com.bcits.employeedatajpa.repository.EmployeeRepository;

@RestController
public class EmployeerestController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	//@GetMapping(path="/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
		public EmployeeResponse getEmployee(int empId, String password) {
		
		
		
		EmployeeInfoBean employeeInfoBean=repository.getEmployeeByIdAndPwd(empId, password);
		
		
		//Optional<EmployeeInfoBean> op=repository.findById(empId);
		
		EmployeeResponse response=new EmployeeResponse();
		
		//if(op.isPresent()) {
		
		if(employeeInfoBean !=null) {
			//EmployeeInfoBean employeeInfoBean=op.get();
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Record for employee ID "+ empId+ " Found.");
			response.setEmployeeInfoBean(employeeInfoBean);
		}else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Record for employee ID "+ empId+ " Not Found.");
		//	response.setEmployeeInfoBean(employeeInfoBean);
			
		}
		return response;
	}

}
