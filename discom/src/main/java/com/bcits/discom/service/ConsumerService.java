package com.bcits.discom.service;

import com.bcits.discom.beans.ConsumerMaster;

public interface ConsumerService {
	public boolean consumerSignUp(ConsumerMaster consumerMaster, String confirmPassword);
	public ConsumerMaster consumerLogin(String meterNumber, String password);
}
