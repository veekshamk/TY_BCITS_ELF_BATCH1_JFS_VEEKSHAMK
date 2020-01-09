package com.bcits.jpawithhibernate.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.common.bean.Test1;

public class App 
{
    public static void main( String[] args )
    {
    	Test1 test = new Test1();
		test.setBlood_group("a+");
		test.setDept_id(150);
		test.setDesignation("manager");
		test.setDob(java.sql.Date.valueOf("2000-10-10"));
		test.setDoj(java.sql.Date.valueOf("2000-10-10"));
		test.setEmp_id(25);
		test.setManager_id(100);
		test.setMobile_number(784561235);
		test.setName("varuna");
		test.setOfficial_mail_id("varuna123@gmail.com");
		test.setSalary(10000);
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(test);
		System.out.println("Record Saved");
		transaction.commit();
		manager.close();
	}
    	
    }

