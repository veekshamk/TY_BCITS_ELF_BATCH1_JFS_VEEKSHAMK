package com.bcits.discom.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.beans.QueryMessageBean;
import com.bcits.discom.dao.EmployeeDAO;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeMasterBean employeeLogin(int empId, String password) {
		if(empId<1 && password.isEmpty()) {
			return null;
		}
		return dao.employeeLogin(empId, password);
	}//End of employeeLogin()

	@Override
	public long numOfConsumer(String region) {
		return dao.numOfConsumer(region);
	}//End of numOfConsumer()

	@Override
	public boolean addEmployee(EmployeeMasterBean employeeBean) {
		return dao.addEmployee(employeeBean);
	}//End of addEmployee()

	@Override
	public List<ConsumerMasterBean> showAllConsumers(String region) {
		return dao.showAllConsumers(region);
	}//End of showAllConsumers()

	@Override
	public boolean addCurrentBill(CurrentBillBean currentBill) {
		if(currentBill != null) {
			return dao.addCurrentBill(currentBill);
		}
		return false;
	}//End of addCurrentBill()


	@Override
	public List<QueryMessageBean> getQueryList(String region) {
		if (region != null) {
			return dao.getQueryList(region);
		}
		return null;
	}//End of getQueryList()


	@Override
	public boolean sendRespond(String rrNumber, String response, Date date) {
		return dao.sendRespond(rrNumber, response, date);
		}//End of sendRespond()	
	
	

}//End of Class