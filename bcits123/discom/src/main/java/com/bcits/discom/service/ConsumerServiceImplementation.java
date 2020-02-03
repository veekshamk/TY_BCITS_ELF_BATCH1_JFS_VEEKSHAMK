package com.bcits.discom.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.PaymentDetailBean;
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
	public boolean payment(PaymentDetailBean paymentBean) {
		return false;
	}

	@Override
	public List<CurrentBillBean> showBillHistory(String rrNumber) {
		return null;
	}

	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		return dao.generateCurrentBill(rrNumber);
	}
}
