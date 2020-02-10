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
	}//End of consumerSignUp()

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from ConsumerMasterBean where email= :email ");
		query.setParameter("email", email);
		ConsumerMasterBean consumerBean = (ConsumerMasterBean) query.getSingleResult();
		if(consumerBean != null && consumerBean.getPassword().equals(password)) {
			return consumerBean;
		}
		return null;
	}//End of consumerLogin()


	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		System.out.println(rrNumber);
		EntityManager manager=factory.createEntityManager();

		CurrentBillBean currentBill=manager.find(CurrentBillBean.class, rrNumber);
		if(currentBill != null) {
			return currentBill;
		}
		return null;
	}//End of generateCurrentBill()

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
	}//End of showBillHistory()

	@Override
	public List<MonthlyConsumptionBean> showMonthlyConsumption(String rrNumber) {

		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(" from MonthlyConsumptionBean where rr_Number=:rrNum ");
		query.setParameter("rrNum", rrNumber);
		List<MonthlyConsumptionBean> consumptionList=query.getResultList();
		if(consumptionList!=null) {
			return consumptionList;
		}
		manager.close();
		return null;
	}//End of showMonthlyConsumption()

	@Override
	public boolean payment(String rrNumber, Date date, double amount) {
		try {
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();

			String jpql = " from MonthlyConsumptionBean where consumptionPk.rrNumber =:rrNum order by finalReading desc ";
			transaction.begin();
			Query query = manager.createQuery(jpql);
			query.setMaxResults(1);
			query.setParameter("rrNum", rrNumber);

			BillHistoryBean billHistoryBean=new BillHistoryBean();
			BillHistoryPK billHistoryPk=new BillHistoryPK();
			MonthlyConsumptionBean monthlyConsumptionBean = (MonthlyConsumptionBean) query.getSingleResult();

			billHistoryBean.setTotalAmount(amount);
			billHistoryBean.setStatus("paid");
			billHistoryPk.setRrNumber(rrNumber);
			billHistoryPk.setDate(date);
			billHistoryBean.setHistory(billHistoryPk);

			monthlyConsumptionBean.setStatus("Paid");
			System.out.println(billHistoryBean);
			System.out.println(billHistoryPk);

			manager.persist(billHistoryBean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}//End of payment()

	@Override
	public ConsumerMasterBean getConsumer(String rrNumber) {
		System.out.println(rrNumber);
		EntityManager manager = factory.createEntityManager();
		ConsumerMasterBean consumerBean = manager.find(ConsumerMasterBean.class, rrNumber);

		if(consumerBean != null) {
			return consumerBean;
		}
		manager.close();
		return null;
	}//End of getConsumer()

	@Override
	public long getInitialReading(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		long initialRead;
		try {
			String jpql =" select finalReading from MonthlyConsumptionBean where consumptionPk.rrNumber=:rrNumber order by finalReading desc";
			Query query= manager.createQuery(jpql);
			query.setParameter("rrNumber", rrNumber);
			query.setMaxResults(1);
			initialRead = (long) query.getSingleResult();
			manager.close();
		}catch (Exception e) {
			return 0;
		}
		if(initialRead != 0) {
			return initialRead;
		}
		return 0;
	}//End of getInitialReading()

	@Override
	public List<MonthlyConsumptionBean> getAllBills(String region) {

		EntityManager manager = factory.createEntityManager();
		String jpql = " from MonthlyConsumptionBean where region=:region ";
		Query query = manager.createQuery(jpql);
		query.setParameter("region", region);
		List<MonthlyConsumptionBean> allBills = query.getResultList();
		System.out.println(allBills);
		if(allBills != null) {
			return allBills;
		}
		manager.close();
		return null;
	}//End of getAllbills()
}//End of Class
