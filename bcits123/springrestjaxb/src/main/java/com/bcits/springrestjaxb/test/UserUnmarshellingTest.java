package com.bcits.springrestjaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bcits.springrestjaxb.beans.UserInfoBean;

public class UserUnmarshellingTest {
	public static void main(String[] args) {
		
		JAXBContext context;
		
		try {
		context=JAXBContext.newInstance(UserInfoBean.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
	
		UserInfoBean userInfoBean=(UserInfoBean) unmarshaller.unmarshal(new File("userInfo.xml"));
		
		System.out.println("Salary= "+userInfoBean.getSalary());
		System.out.println("Designation= "+userInfoBean.getDesignation());
		System.out.println("Gender="+userInfoBean.getUserOtherInfoBean().getGender());
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
