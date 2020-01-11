package com.bcits.jpa.hiberanate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpa.hibernate.bean.DepartmentInfo;

public class DeleteDept {
	public static void main(String[] args) {
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			manager=entityManagerFactory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			DepartmentInfo info=manager.find(DepartmentInfo.class, 130);
			
			manager.remove(info);
			transaction.commit();
			System.out.println("Record Deleted");
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}
	}

}
