package com.bcits.jpawithhibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;
import com.bcits.jpawithhibernate.one.to.many.EmployeeAddressInfo;
import com.bcits.jpawithhibernate.one.to.many.EmployeeAddressPK;

public class TestManyToOne {
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
		primary.setEmp_id(72);
		primary.setManager_id(100);
		primary.setMobile_number(784561235);
		primary.setName("varuna");
		primary.setOfficial_mail_id("varuna123@gmail.com");
		primary.setSalary(10000);

		EmployeeAddressPK addressPk=new EmployeeAddressPK();
		addressPk.setAddress_type("permanent");
		addressPk.setEmp_id(72);


		EmployeeAddressInfo address=new EmployeeAddressInfo();
		address.setAddress(addressPk);
		address.setAddress1("banagara");
		address.setAddress2("bavani house");
		address.setCity("bangalore");
		address.setHouse_number("#123");
		address.setLandmark("bangalore1");
		address.setPincode(12344);
		address.setPrimary(primary);


		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo pr=manager.find(EmployeePrimaryInfo.class, 1);
			System.out.println(pr.getAddressinfo().get(0).getAddress1());
			System.out.println(pr.getAddressinfo().get(1).getAddress2());
			//address.setPrimary(pr);
			//manager.persist(address);
			System.out.println("record saved");
			//System.out.println("Record inserted");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
	}

}
