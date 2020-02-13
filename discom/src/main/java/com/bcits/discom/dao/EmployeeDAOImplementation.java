package com.bcits.discom.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcits.discom.beans.ConsumerMasterBean;
import com.bcits.discom.beans.CurrentBillBean;
import com.bcits.discom.beans.EmployeeMasterBean;
import com.bcits.discom.beans.MonthlyConsumptionBean;
import com.bcits.discom.beans.MonthlyConsumptionPK;
import com.bcits.discom.beans.QueryBean;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Autowired
	private TarrifCalculation tarrifCalculation;

	@Override
	public EmployeeMasterBean employeeLogin(int empId, String password) {
		EntityManager manager = factory.createEntityManager();
		EmployeeMasterBean employeeBean = manager.find(EmployeeMasterBean.class, empId);

		if (employeeBean != null && employeeBean.getPassword().equals(password)) {
			return employeeBean;
		}
		return null;
	}//End of employeeLogin()

	@Override
	public long numOfConsumer(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = " select count(*) from ConsumerMasterBean where region=:region ";
		Query query = manager.createQuery(jpql);
		query.setParameter("region", region);
		long num = (long) query.getSingleResult();
		if (num != 0) {
			return num;
		}
		return 0;
	}//End of numOfConsumer()

	@Override
	public boolean addEmployee(EmployeeMasterBean employeeBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(employeeBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}//End of addEmployee()

	@Override
	public List<ConsumerMasterBean> showAllConsumers(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = " from ConsumerMasterBean where region=:region ";
		Query query = manager.createQuery(jpql);
		query.setParameter("region", region);

		List<ConsumerMasterBean> consumerList = (List<ConsumerMasterBean>) query.getResultList();
		System.out.println(consumerList);
		if (consumerList != null) {
			return consumerList;
		}
		return null;
	}//End of showAllConsumers()

	@Override
	public boolean addCurrentBill(CurrentBillBean currentBill) {

		double unitsConsumed = currentBill.getFinalReading() - currentBill.getInitialReading();

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		MonthlyConsumptionPK consumptionPK = new MonthlyConsumptionPK();
		MonthlyConsumptionBean consumptionBean = new MonthlyConsumptionBean();

		CurrentBillBean currentBillBean = manager.find(CurrentBillBean.class, currentBill.getRrNumber());

		double totalAmount = tarrifCalculation.billCalculation(unitsConsumed, currentBill.getTypeOfConsumer());

		try {
			transaction.begin();

			if (currentBillBean != null) {
				manager.remove(currentBillBean);
			}

			consumptionPK.setDate(new Date());
			consumptionPK.setRrNumber(currentBill.getRrNumber());
			consumptionBean.setConsumptionPk(consumptionPK);

			consumptionBean.setTotalAmount(totalAmount);
			consumptionBean.setStatus("Not Paid");
			consumptionBean.setInitialReading(currentBill.getInitialReading());
			consumptionBean.setFinalReading(currentBill.getFinalReading());
			consumptionBean.setUnitsConsumed(unitsConsumed);
			consumptionBean.setRegion(currentBill.getRegion());
			currentBill.setTotalAmount(totalAmount);
			currentBill.setUnitsConsumed(unitsConsumed);

			manager.persist(consumptionBean);
			manager.persist(currentBill);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}//End of addCurrentBill()

	@Override
	public boolean sendRespond(String rrNumber, String queryResponse, Date date) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = " from QueryBean where queryPk.rrNumber=:num and DATE(queryPk.date)=:date ";
			Query query = manager.createQuery(jpql);
			query.setParameter("num", rrNumber);
			query.setParameter("date", date);
			QueryBean queryBean = (QueryBean) query.getSingleResult();
			queryBean.setQueryResponse(queryResponse);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}//End of sendRespond() 
	
	@Override
	public List<QueryBean> getQueryList(String region) {
		EntityManager manager = factory.createEntityManager();

			String jpql = " from QueryBean where region =:region ";
			Query query = manager.createQuery(jpql);
			query.setParameter("region", region);
			List<QueryBean> queryList = query.getResultList();
			if (queryList == null && queryList.isEmpty()) {
				return null;
			}
			return queryList;
	}//End of getQueryList()

	@Override
	public List<Object[]> monthRevenue(String region) {
		
		EntityManager manager = factory.createEntityManager();
		try {
		String jpql = " select sum(totalAmount), DATE_FORMAT(consumptionPk.date, '%y-%m')from MonthlyConsumptionBean "
				+ " where region=:region and status='paid' group by month(consumptionPk.date) ";
		Query query = manager.createQuery(jpql);
		query.setParameter("region", region);
		List<Object[]> paid = query.getResultList();
		return paid;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}//End of Class
