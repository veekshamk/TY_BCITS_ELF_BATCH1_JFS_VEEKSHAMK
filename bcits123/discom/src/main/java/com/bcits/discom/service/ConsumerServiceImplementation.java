package com.bcits.discom.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.discom.beans.BillHistoryBean;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.MonthlyConsumptionBean;
import com.bcits.discom.dao.ConsumerDAO;

@Service
public class ConsumerServiceImplementation implements ConsumerService{


	@Autowired
	private ConsumerDAO dao;

	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean, String confirmPassword) {
		if (consumerBean.getPassword().equals(confirmPassword)) {
			return dao.consumerSignUp(consumerBean);
		}
		return false;
	}//End of consumerSignUp()

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		if(email.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.consumerLogin(email, password);
	}//End of consumerLogin()	


	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {

		return dao.showBillHistory(rrNumber);
	}//End of showBillHistory()

	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		return dao.generateCurrentBill(rrNumber);
	}//End of generateCurrentBill()

	@Override
	public List<MonthlyConsumptionBean> showMonthlyConsumption(String rrNumber) {

		return dao.showMonthlyConsumption(rrNumber);
	}//End of showMonthlyConsumption()

	@Override
	public boolean payment(String rrNumber, Date date, double amount) {

		return dao.payment(rrNumber, date, amount);
	}//End of payment()

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {
		return dao.getConsumer(rrNumber);
	}//End of getConsumer()

	@Override
	public long getInitialReading(String rrNumber) {
		return dao.getInitialReading(rrNumber);
	}//End of getInitialReading()

	@Override
	public List<MonthlyConsumptionBean> getAllBills(String region) {
		return dao.getAllBills(region);
	}//End of getAllbills()


}//End of Class
