package com.bcits.springboot.dao;

import java.util.List;

import com.bcits.springboot.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public boolean addEmployee(EmployeeInfoBean bean);
	
	public boolean deleteEmployee(int empId);
	
	public boolean updateEmployee(EmployeeInfoBean bean);
	
	public EmployeeInfoBean getEmployee(int empId);
	
	public  List<EmployeeInfoBean> getAllEmployees();
	
	public EmployeeInfoBean authenticate(int empId, String password);

}
