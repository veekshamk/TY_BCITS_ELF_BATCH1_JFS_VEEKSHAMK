package com.bcits.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.bean.Test;

public class App {
	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager manager=null;

		Test test = new Test();
		test.setId(4);
		test.setMovieName("Kuch Kuch Hota Hai");
		test.setMovierating("Best");

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
		}finally {
			manager.close();
		}
	}
}
