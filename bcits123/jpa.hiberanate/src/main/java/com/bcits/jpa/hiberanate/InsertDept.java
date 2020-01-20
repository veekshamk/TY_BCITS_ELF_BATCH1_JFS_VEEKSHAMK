package com.bcits.jpa.hiberanate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.bcits.jpa.hibernate.bean.DepartmentInfo;

public class InsertDept 
{
	public static void main( String[] args )
	{
		EntityManager m=null;
		EntityTransaction transaction=null;
		DepartmentInfo dept=new DepartmentInfo();
		dept.setDept_id(25);
		dept.setDept_manager_id(123);
		dept.setDept_name("health");

		try {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
			m=emf.createEntityManager();
			transaction=m.getTransaction();

			transaction.begin();
			m.persist(dept);
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		m.close();
	}
}
