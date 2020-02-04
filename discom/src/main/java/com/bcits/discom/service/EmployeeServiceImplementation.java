package com.bcits.discom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.dao.EmployeeDAO;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;


	@Override
	public EmployeeMasterBean empauthenticate(int empId, String password) {
		return null;
	}

}
