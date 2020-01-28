package com.bcits.springrestjaxb.jsontest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.beans.EmployeeInfoBean;

public class EmployeeJSONUnmarshalling {
	
	public static void main(String[] args) {
		
		try {
			
			ObjectMapper mapper= new ObjectMapper();
			EmployeeInfoBean employeeInfoBean=mapper.readValue(new File("empJson1.json"), EmployeeInfoBean.class);
			
			System.out.println("DOB=>"+employeeInfoBean.getDob());
			System.out.println("Designation=>"+employeeInfoBean.getDesignation());
			System.out.println("password=>"+employeeInfoBean.getPassword());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
