package com.bcits.springrestjaxb.test;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bcits.springrestjaxb.beans.EmployeeInfoBean;

public class EmployeeMarshallingTest {
	public static void main(String[] args) {
		
		EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
		employeeInfoBean.setBloodGroup("a+");
		employeeInfoBean.setDeptId(10);
		employeeInfoBean.setDesignation("SD");
		employeeInfoBean.setDob(new Date());
		employeeInfoBean.setDoj(new Date());
		employeeInfoBean.setEmpId(100);
		employeeInfoBean.setManagerId(10);
		employeeInfoBean.setMobileNumber(1478523690);
		employeeInfoBean.setName("ShreeVidya");
		employeeInfoBean.setOfficialMailId("shri@gmail.com");
		employeeInfoBean.setPassword("qwerty");
		employeeInfoBean.setSalary(12000);
		
		try {
			JAXBContext context=JAXBContext.newInstance(EmployeeInfoBean.class);
			Marshaller marshaller=context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);	//for formated XML
			marshaller.marshal(employeeInfoBean, System.out);
			marshaller.marshal(employeeInfoBean, new File("employeeInfo.xml"));
			
		} catch (JAXBException e) {
			System.err.println("Unable to Marshal!!!");
			e.printStackTrace();
		}
		
			
	}

}
