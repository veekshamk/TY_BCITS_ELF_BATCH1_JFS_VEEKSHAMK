package com.bcits.discom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.discom.beans.AdminBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.dao.AdminDAO;
@Service
public class AdminServiceImplementation implements AdminService {
	
	@Autowired
	private AdminDAO dao;

	
	@Override
	public AdminBean adminLogin(String email, String password) {
		if(email.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.adminLogin(email, password);
	}

	@Override
	public boolean addEmployee(EmployeeMasterBean employeeBean) {
		return dao.addEmployee(employeeBean);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}
	

}
