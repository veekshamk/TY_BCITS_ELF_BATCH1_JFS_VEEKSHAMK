package com.bcits.jpa.hiberanate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpa.hibernate.bean.DepartmentInfo;

public class RetrieveDept {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		//DepartmentInfo info=manager.find(DepartmentInfo.class, 10);
		
		DepartmentInfo info=manager.getReference(DepartmentInfo.class, 10);
		
		//System.out.println(info.getClass());
		
		//System.out.println(info.getName());
		System.out.println("Department Name=>"+info.getDept_name());
		System.out.println("Department ID=>"+info.getDept_id());
		System.out.println("Department Manager ID=>"+info.getDept_manager_id());

		manager.close();
	}


}
