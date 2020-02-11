package com.bcits.discom.dao;

import java.util.Date;
import java.util.List;

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.beans.QueryMessageBean;

public interface EmployeeDAO {
	public EmployeeMasterBean employeeLogin(int empId, String password);
	public long numOfConsumer(String region);
	public boolean addEmployee(EmployeeMasterBean employeeBean);
	public List<ConsumerMasterBean> showAllConsumers(String region);
	public boolean addCurrentBill(CurrentBillBean currentBill);
	
	public List<QueryMessageBean> getQueryList(String region);
	public boolean sendRespond(String rrNumber, String queryResponse, Date date);
}//End of Class
