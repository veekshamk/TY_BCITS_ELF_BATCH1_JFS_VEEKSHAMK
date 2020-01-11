package com.bcits.jpawithhibernate.jpql.dynamicquery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager m=null;
		EntityTransaction transaction=null;
		
		 try {
			emf=Persistence.createEntityManagerFactory("test");
			 m=emf.createEntityManager();
			 transaction=m.getTransaction();
			
			transaction.begin();
			String jpql=" update EmployeePrimaryInfo set name=:nm where emp_id=:id ";
			Query query=m.createQuery(jpql);
			query.setParameter("id", 5);
			query.setParameter("nm", "Sharanya");
			int count= query.executeUpdate();
			System.out.println("No of Row Affected "+count);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		 m.close();
	}

}
