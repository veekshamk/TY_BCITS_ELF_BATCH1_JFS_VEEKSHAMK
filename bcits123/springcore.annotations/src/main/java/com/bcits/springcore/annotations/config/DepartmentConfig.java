package com.bcits.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bcits.springcore.annotations.beans.DepartmentBean;
import com.bcits.springcore.annotations.beans.EmployeeBean;

@Configuration
public class DepartmentConfig {
	
//	@Bean
//	public DepartmentBean getDepartmentBean() {
//		DepartmentBean departmentBean=new DepartmentBean();
//		departmentBean.setDeptId(101);
//		departmentBean.setDeptName("Dev");
//		
//		return departmentBean;
//	}
	
	@Bean(name="dev")
	public DepartmentBean getDeptDev() {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setDeptId(101);
		departmentBean.setDeptName("Dev");
		
		return departmentBean;
	}
	//@Primary
	@Bean(name="hr")
	public DepartmentBean getDeptHr() {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("HR");
		
		return departmentBean;
	}
	
	@Bean(name="acc")
	public DepartmentBean getDeptAccount() {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setDeptId(103);
		departmentBean.setDeptName("Account");
		
		return departmentBean;
	}
	

}
