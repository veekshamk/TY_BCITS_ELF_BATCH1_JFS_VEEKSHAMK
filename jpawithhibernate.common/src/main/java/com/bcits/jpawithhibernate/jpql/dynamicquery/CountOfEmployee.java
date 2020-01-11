package com.bcits.jpawithhibernate.jpql.dynamicquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountOfEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager m=null;
		EntityTransaction transaction=null;

		try {
			emf=Persistence.createEntityManagerFactory("test");
			m=emf.createEntityManager();
			transaction=m.getTransaction();

			transaction.begin();
			String jpql=" select count(*) from EmployeePrimaryInfo ";
			Query query=m.createQuery(jpql);
			System.out.println(query.getSingleResult());
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		m.close();
	}
}
