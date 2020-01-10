package com.bcits.jpawithhibernate.common.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

public class RetrieveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		//EmployeePrimaryInfo info=manager.find(EmployeePrimaryInfo.class, 1);
		
		EmployeePrimaryInfo info=manager.getReference(EmployeePrimaryInfo.class, 1);
		
		//System.out.println(info.getClass());
		
		//System.out.println(info.getName());
		
//		System.out.println("blood group=>"+info.getBlood_group());
//		System.out.println("Designation=>"+info.getDesignation());
//		System.out.println("Employee Name=>"+info.getName());
//		System.out.println("Official Email ID=>"+info.getOfficial_mail_id());
//		System.out.println("Department ID=>"+info.getDept_id());
//		System.out.println("Employee ID=>"+info.getEmp_id());
//		System.out.println("Manager ID=>"+info.getManager_id());
//		System.out.println("Mobile Number=>"+info.getMobile_number());
//		System.out.println("Salary=>"+info.getSalary());
//		System.out.println("DOB=>"+info.getDob());
//		System.out.println("DOJ=>"+info.getDoj());
		manager.close();
	}

}
