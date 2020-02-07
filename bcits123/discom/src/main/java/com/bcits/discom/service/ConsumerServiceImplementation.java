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
	}

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		if(email.isEmpty() && password.isEmpty()) {
			return null;
		}
		return dao.consumerLogin(email, password);
	}	


	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {

		return dao.showBillHistory(rrNumber);
	}

	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		return dao.generateCurrentBill(rrNumber);
	}

	@Override
	public List<MonthlyConsumptionBean> showMonthlyConsumption(String rrNumber) {

		return dao.showMonthlyConsumption(rrNumber);
	}

	@Override
	public boolean payment(String rrNumber, Date date, double amount) {

		return dao.payment(rrNumber, date, amount);
	}

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {
		return dao.getConsumer(rrNumber);
	}

	@Override
	public long getInitialReading(String rrNumber) {
		return dao.getInitialReading(rrNumber);
	}

	@Override
	public List<MonthlyConsumptionBean> getAllbills(String region) {
		return dao.getAllbills(region);
	}


}
