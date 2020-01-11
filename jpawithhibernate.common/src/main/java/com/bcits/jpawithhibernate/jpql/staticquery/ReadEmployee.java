package com.bcits.jpawithhibernate.jpql.staticquery;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

public class ReadEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("test");
		EntityManager m= emf.createEntityManager();
		
		String jpql=" from EmployeePrimaryInfo ";
		Query query= m.createQuery(jpql);
		List<EmployeePrimaryInfo> list= query.getResultList();
		for (EmployeePrimaryInfo employeePrimaryInfo : list) {
			System.out.println("Blood Group=>"+employeePrimaryInfo.getBlood_group());
			System.out.println("Designation=>"+employeePrimaryInfo.getDesignation());
			System.out.println("Name=>"+employeePrimaryInfo.getName());
			System.out.println("Mail ID=>"+employeePrimaryInfo.getOfficial_mail_id());
			System.out.println("Department ID=>"+employeePrimaryInfo.getDept_id());
			System.out.println("Employee ID=>"+employeePrimaryInfo.getEmp_id());
			System.out.println("Manager ID=>"+employeePrimaryInfo.getManager_id());
			System.out.println("Mobile Number=>"+employeePrimaryInfo.getMobile_number());
			System.out.println("Salary=>"+employeePrimaryInfo.getSalary());
			System.out.println("DOB=>"+employeePrimaryInfo.getDob());
			System.out.println("DOJ=>"+employeePrimaryInfo.getDoj());
			
		}
	}

}
