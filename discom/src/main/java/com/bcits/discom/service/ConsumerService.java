package com.bcits.discom.service;

import java.util.Date;
import java.util.List;

import com.bcits.discom.beans.BillHistoryBean;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.MonthlyConsumptionBean;
import com.bcits.discom.beans.QueryBean;

public interface ConsumerService {

	public boolean consumerSignUp(ConsumerMasterBean consumerBean,String confirmPassword);
	public ConsumerMasterBean consumerLogin(String email, String password);
	public boolean payment(String rrNumber, Date date, double amount);
	public CurrentBillBean generateCurrentBill(String rrNumber);
	public List<BillHistoryBean> showBillHistory(String rrNumber);
	public List<MonthlyConsumptionBean> showMonthlyConsumption(String rrNumber);
	public ConsumerMasterBean getConsumer(String rrNumber);
	public long getInitialReading(String rrNumber);
	public List<MonthlyConsumptionBean> getAllBills(String region);
	public List<QueryBean> getResponse(String rrNumber);
	public boolean setQuery(String request, String rrNumber, String region);
}//End of Class
