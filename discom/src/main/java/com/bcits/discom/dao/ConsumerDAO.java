package com.bcits.discom.dao;

import com.bcits.discom.beans.ConsumerMaster;

public interface ConsumerDAO {
	public boolean consumerSignUp(ConsumerMaster consumerMaster, String password);
	public ConsumerMaster consumerLogin(String meterNumber, String password);

}