package com.bcits.springrestjaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.bcits.springrestjaxb.beans.EmployeeInfoBean;

public class EmployeeUnmarshallingTest {
	public static void main(String[] args) {
		
		JAXBContext context;
		try {
			context=JAXBContext.newInstance(EmployeeInfoBean.class);
			Unmarshaller unmarshaller=context.createUnmarshaller();
			
			EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) unmarshaller.unmarshal(new File("employeeInfo1.xml"));
			
			System.out.println("Emp ID ="+employeeInfoBean.getEmpId());
			System.out.println("Dept ID="+employeeInfoBean.getDeptId());
			System.out.println("Designation="+employeeInfoBean.getDesignation());
			System.out.println("DOB="+employeeInfoBean.getDob());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
