package com.bcits.discom.service;

import com.bcits.discom.beans.ConsumerMaster;

public class ConsumerServiceImplementation implements ConsumerService{

	@Override
	public boolean consumerSignUp(ConsumerMaster consumerMaster, String confirmPassword) {
		return false;
	}

	@Override
	public ConsumerMaster consumerLogin(String meterNumber, String password) {
		return null;
	}

	

}
