package com.bcits.springcore.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeBean {
	
	private String name;
	private int age;
	private DepartmentBean departmentBean;
	
	public EmployeeBean() {
		
	}
	
//	public DepartmentBean getDepartmentBean() {
//		return departmentBean;
//	}
//	public void setDepartmentBean(DepartmentBean departmentBean) {
//		this.departmentBean = departmentBean;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	

}
