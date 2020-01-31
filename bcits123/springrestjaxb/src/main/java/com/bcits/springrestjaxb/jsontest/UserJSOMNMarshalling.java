package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.beans.UserAddressBean;
import com.bcits.springrestjaxb.beans.UserInfoBean;
import com.bcits.springrestjaxb.beans.UserOtherInfoBean;

public class UserJSOMNMarshalling {
	public static void main(String[] args) {
		
		UserInfoBean userInfoBean=new UserInfoBean();
		userInfoBean.setBloodGroup("a+");
		userInfoBean.setDeptId(10);
		userInfoBean.setDesignation("SD");
		userInfoBean.setDob(new Date());
		userInfoBean.setDoj(new Date());
		userInfoBean.setEmpId(100);
		userInfoBean.setManagerId(10);
		userInfoBean.setMobileNumber(1478523690);
		userInfoBean.setName("ShreeVidya");
		userInfoBean.setOfficialMailId("shri@gmail.com");
		userInfoBean.setPassword("qwerty");
		userInfoBean.setSalary(12000);

		UserOtherInfoBean userOtherInfoBean=new UserOtherInfoBean();
		userOtherInfoBean.setGender("Female");
		userOtherInfoBean.setAdharNumber(1478520369L);
		
		userInfoBean.setUserOtherInfoBean(userOtherInfoBean);
		
		UserAddressBean TempAddressInfo=new UserAddressBean();
		TempAddressInfo.setAddressType('t');
		TempAddressInfo.setCity("BLR");
		TempAddressInfo.setHouseNum(1);
		TempAddressInfo.setStreet("abc street");
		
		UserAddressBean PermAddressInfo=new UserAddressBean();
		PermAddressInfo.setAddressType('p');
		PermAddressInfo.setCity("HYD");
		PermAddressInfo.setHouseNum(2);
		PermAddressInfo.setStreet("xyz street");
		
		List<UserAddressBean> userAddressList=new ArrayList<>();
		userAddressList.add(TempAddressInfo);
		userAddressList.add(PermAddressInfo);
		
		userInfoBean.setUserAddressBean(userAddressList);
		
		try {

			ObjectMapper mapper= new ObjectMapper();
			mapper.writerWithDefaultPrettyPrinter();
			mapper.writeValue(new File("userJSON2.json"), userInfoBean);
			mapper.writeValue(System.out, userInfoBean);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}