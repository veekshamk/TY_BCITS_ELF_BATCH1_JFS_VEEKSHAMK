package com.bcits.springrestjaxb.jsontest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.beans.EmployeeInfoBean;
import com.bcits.springrestjaxb.beans.UserInfoBean;

public class UserJSONUnmarshalling {
	public static void main(String[] args) {

		try {

			ObjectMapper mapper= new ObjectMapper();
			UserInfoBean userInfoBean=mapper.readValue(new File("userJson1.json"), UserInfoBean.class);

			System.out.println("Designation: "+userInfoBean.getDesignation());
			System.out.println("Dept ID:"+userInfoBean.getDeptId());
			System.out.println();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


