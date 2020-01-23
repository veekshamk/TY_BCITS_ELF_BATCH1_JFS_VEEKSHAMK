package com.bcits.hibernate.practice.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.hibernate.practice.EmployeeBankInfo;
import com.bcits.hibernate.practice.EmployeeInfo;

public class OneToOne {
	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;

		EmployeeInfo info=new EmployeeInfo();
		info.setDept_id(109);
		info.setDesignation("tester");
		info.setEmail("vikz2020@gmail.com");
		info.setId(4);
		info.setName("Veeksha");
		info.setPhone_num(1234567890);


		EmployeeBankInfo bank=new EmployeeBankInfo();
		bank.setAccount_holder_name("veeksha");
		bank.setAccount_num(12345671);
		bank.setIfsc_code("ka123");
		bank.setEmpInfo(info);

		try {
			emf=Persistence.createEntityManagerFactory("test");
			manager=emf.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			System.out.println("data inserted");
			transaction.commit();

		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
			manager.close();
		

	}

}
