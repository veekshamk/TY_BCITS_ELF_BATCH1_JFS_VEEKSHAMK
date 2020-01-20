package com.bcits.jpawithhibernate.jpql.staticquery;

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
			String jpql=" update EmployeePrimaryInfo set name='Sharvi' where emp_id=5 ";
			Query query=m.createQuery(jpql);
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
