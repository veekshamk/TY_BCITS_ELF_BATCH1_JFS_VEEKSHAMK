package com.bcits.jpawithhibernate.common.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

public class FindEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager manager=entityManagerFactory.createEntityManager();
		EmployeePrimaryInfo info=manager.find(EmployeePrimaryInfo.class, 1);
		
		System.out.println("EmployeeID=>"+info.getBlood_group());
		System.out.println("Designation=>"+info.getDesignation());
		System.out.println("Employee Name=>"+info.getName());
		System.out.println("Official Email ID=>"+info.getOfficial_mail_id());
		System.out.println("DepartmentID=>"+info.getDept_id());
		System.out.println("EmployeeID=>"+info.getEmp_id());
		System.out.println("ManagerID=>"+info.getManager_id());
		System.out.println("Mobile Number=>"+info.getMobile_number());
		System.out.println("Salary=>"+info.getSalary());
		System.out.println("DOB=>"+info.getDob());
		System.out.println("DOJ=>"+info.getDoj());
		
		manager.close();
	}

}
