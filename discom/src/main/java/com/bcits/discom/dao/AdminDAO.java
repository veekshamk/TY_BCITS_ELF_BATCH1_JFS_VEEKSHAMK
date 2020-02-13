package com.bcits.discom.dao;

import com.bcits.discom.beans.AdminBean;
import com.bcits.discom.beans.EmployeeMasterBean;

public interface AdminDAO {
	
	public AdminBean adminLogin(String email, String password);
	public boolean addEmployee(EmployeeMasterBean employeeBean);
	public boolean deleteEmployee(int empId);

}
