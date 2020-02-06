package com.bcits.discom.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.PaymentDetailBean;

@Repository
public class ConsumerDAOImplementation implements ConsumerDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean) {
		//System.out.println(consumerBean);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(consumerBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from ConsumerMasterBean where email= :email ");
		query.setParameter("email", email);
		ConsumerMasterBean InfoBean = (ConsumerMasterBean) query.getSingleResult();
		if(InfoBean != null && InfoBean.getPassword().equals(password)) {
			return InfoBean;
		}
		return null;
	}

	@Override
	public boolean payment(PaymentDetailBean paymentBean) {
		return false;
	}

	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		EntityManager manager=factory.createEntityManager();
		CurrentBillBean bill=manager.find(CurrentBillBean.class, rrNumber);
		System.out.println(bill);
		if(bill!=null) {
			return bill;
		}
		return null;
	}

	@Override
	public List<CurrentBillBean> showBillHistory(String rrNumber) {
		return null;
	}
}
