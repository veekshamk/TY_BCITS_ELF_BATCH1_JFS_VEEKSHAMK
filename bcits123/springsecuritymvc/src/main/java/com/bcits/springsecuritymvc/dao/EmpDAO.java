package com.bcits.springsecuritymvc.dao;

import java.util.List;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;

public interface EmpDAO {
	
	public boolean register(EmpInfoBean empBean);	//for password encryption
	public EmpInfoBean getEmployee(int empId);
	public List<EmpInfoBean> getAllEmployees();
	
}
