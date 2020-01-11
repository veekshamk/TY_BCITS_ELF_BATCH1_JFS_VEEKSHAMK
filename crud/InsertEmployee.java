package com.bcits.jpawithhibernate.common.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

public class InsertEmployee 
{
	public static void main( String[] args )
	{
		EntityManager manager=null;
		EntityTransaction transaction=null;

		EmployeePrimaryInfo test = new EmployeePrimaryInfo();
		test.setBlood_group("a+");
		test.setDept_id(150);
		test.setDesignation("manager");
		test.setDob(java.sql.Date.valueOf("2000-10-10"));
		test.setDoj(java.sql.Date.valueOf("2000-10-10"));
		test.setEmp_id(28);
		test.setManager_id(100);
		test.setMobile_number(784561235);
		test.setName("varuna");
		test.setOfficial_mail_id("varuna123@gmail.com");
		test.setSalary(10000);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(test);
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}

}

