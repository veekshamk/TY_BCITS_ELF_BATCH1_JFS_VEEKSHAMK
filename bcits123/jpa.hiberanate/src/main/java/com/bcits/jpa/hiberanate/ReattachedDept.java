package com.bcits.jpa.hiberanate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpa.hibernate.bean.DepartmentInfo;

public class ReattachedDept {
	public static void main(String[] args) {
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			 transaction=manager.getTransaction();
			transaction.begin();
			DepartmentInfo info=manager.find(DepartmentInfo.class, 102);
			System.out.println(manager.contains(info));
			manager.detach(info);
			System.out.println(manager.contains(info));
			DepartmentInfo reattached= manager.merge(info);
			reattached.setDept_name("Marketing");
			System.out.println("executed");
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		manager.close();
	}
	}

}
