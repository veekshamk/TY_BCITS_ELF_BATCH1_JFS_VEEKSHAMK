package com.bcits.discom.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.discom.beans.BillHistoryBean;
import com.bcits.discom.beans.BillHistoryPK;
import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.MonthlyConsumptionBean;

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
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		System.out.println(rrNumber);
		EntityManager manager=factory.createEntityManager();

		CurrentBillBean bill=manager.find(CurrentBillBean.class, rrNumber);
		System.out.println(bill);
		if(bill != null) {
			return bill;
		}
		return null;
	}

	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(" from BillHistoryBean where rr_Number=:rrNum ");
		query.setParameter("rrNum", rrNumber);
		List<BillHistoryBean> billList=query.getResultList();
		if(billList!=null) {
			return billList;
		}
		manager.close();
		return null;
	}

	@Override
	public List<MonthlyConsumptionBean> showMonthlyConsumption(String rrNumber) {

		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(" from MonthlyConsumptionBean where rr_Number=:rrNum ");
		query.setParameter("rrNum", rrNumber);
		List<MonthlyConsumptionBean> billList=query.getResultList();
		if(billList!=null) {
			return billList;
		}
		manager.close();
		return null;
	}

	@Override
	public boolean payment(String rrNumber, Date date, double amount) {
		System.out.println(date);
		System.out.println(rrNumber);
		System.out.println(amount);
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		BillHistoryBean billHistoryBean=new BillHistoryBean();
		BillHistoryPK billHistoryPk=new BillHistoryPK();
		
		billHistoryBean.setBillAmount(amount);
		billHistoryBean.setStatus("paid");
		billHistoryPk.setRrNumber(rrNumber);
		billHistoryPk.setDate(date);
		billHistoryBean.setHistory(billHistoryPk);
		
		System.out.println(billHistoryBean);
		System.out.println(billHistoryPk);
		
		if(billHistoryPk !=null) {
			transaction.begin();
			manager.persist(billHistoryBean);
			transaction.commit();
			return true;
		}
		return false;
	}
}
