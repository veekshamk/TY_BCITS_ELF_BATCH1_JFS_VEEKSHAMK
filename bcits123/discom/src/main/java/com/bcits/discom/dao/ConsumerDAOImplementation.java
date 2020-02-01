package com.bcits.discom.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import com.bcits.discom.beans.ConsumerMaster;


public class ConsumerDAOImplementation implements ConsumerDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean consumerSignUp(ConsumerMaster consumerMaster, String password) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(consumerMaster);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return false;
	}

	@Override
	public ConsumerMaster consumerLogin(String meterNumber, String password) {
		return null;
	}

	

}
