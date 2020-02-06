package com.bcits.discom.dao;

import java.util.List;

import com.bcits.discom.beans.AdminBean;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.EmployeeMasterBean;

public interface EmployeeDAO {
	public EmployeeMasterBean employeeLogin(int empId, String password);
	public AdminBean adminLogin(int adminId, String password);
	public long numOfConsumer(String region);
	public boolean addEmployee(EmployeeMasterBean employeeBean);
	public List<ConsumerMasterBean> showAllConsumers(String region);
	public boolean addCurrentBill(CurrentBillBean currentBill, double amount);
	public ConsumerMasterBean getConsumer(String rrNumber);
	public long getInitialReading(String rrNumber);
}
