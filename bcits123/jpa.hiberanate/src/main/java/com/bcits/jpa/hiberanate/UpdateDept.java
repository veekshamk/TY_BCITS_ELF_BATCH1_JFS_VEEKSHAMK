package com.bcits.jpa.hiberanate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpa.hibernate.bean.DepartmentInfo;

public class UpdateDept {
	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager manager=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			manager=entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			DepartmentInfo info=manager.find(DepartmentInfo.class, 25);
			info.setDept_name("medical");
			transaction.commit();
			System.out.println("Record Updated");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}

	}


}
