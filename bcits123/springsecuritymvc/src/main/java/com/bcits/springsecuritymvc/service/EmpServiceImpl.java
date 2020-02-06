package com.bcits.springsecuritymvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;
import com.bcits.springsecuritymvc.dao.EmpDAO;
@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean register(EmpInfoBean empBean) {
		
		if(empBean != null) {
			empBean.setPassword(passwordEncoder.encode(empBean.getPassword()));
			return dao.register(empBean);
		}
		
		return false;
	}

	@Override
	public EmpInfoBean getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
