package com.bcits.jpawithhibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernate.one.to.one.EmployeeSecondaryInfo;

public class TestOneToOne {
	public static void main( String[] args )
	{
		EntityManager manager=null;
		EntityTransaction transaction=null;

		EmployeePrimaryInfo primary = new EmployeePrimaryInfo();
		primary.setBlood_group("a+");
		primary.setDept_id(150);
		primary.setDesignation("manager");
		primary.setDob(java.sql.Date.valueOf("2000-10-10"));
		primary.setDoj(java.sql.Date.valueOf("2000-10-10"));
		primary.setEmp_id(12);
		primary.setManager_id(100);
		primary.setMobile_number(784561235);
		primary.setName("varuna");
		primary.setOfficial_mail_id("varuna123@gmail.com");
		primary.setSalary(10000);
		

		EmployeeSecondaryInfo secondary = new EmployeeSecondaryInfo();
		secondary.setAge(23);
		//secondary.setEmp_id(25);
		secondary.setGender("female");
		secondary.setGovernment_id(10202393);
		secondary.setGuardian_contact_number(908967145);
		secondary.setGuardian_name("madhav");
		secondary.setIs_married("no");
		secondary.setJob_location("bangalore");
		secondary.setNationality("Indian");
		secondary.setPersonal_mail_id("veeksha12345@gmail.com");
		secondary.setPrimary(primary);
		primary.setSecondary(secondary);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			//manager.persist(primary);
			EmployeeSecondaryInfo priInfo=manager.find(EmployeeSecondaryInfo.class, 10);
			System.out.println(priInfo.getGender());
			System.out.println(priInfo.getIs_married());
			System.out.println(priInfo.getPrimary().getDesignation());
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}


}
