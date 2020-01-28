package com.bcits.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.springmvc.crud.operation.EmployeeDAO;
import com.bcits.springmvc.crud.operation.EmployeeInfoBean;
import com.bcits.springmvc.customexception.EmployeeException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		return dao.addEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		if(empId>1) {
		return false;
	}
		return dao.deleteEmployee(empId);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
		
		
		
		return dao.updateEmployee(bean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		if(empId < 1) {
			throw new EmployeeException("Invalid Employee ID");
		}
		EmployeeInfoBean employeeInfoBean=dao.getEmployee(empId);
		
		if(employeeInfoBean==null) {
			throw new EmployeeException("Employee ID not Found..");
		}
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

}
