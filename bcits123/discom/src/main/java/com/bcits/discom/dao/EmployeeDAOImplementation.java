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

import javassist.bytecode.stackmap.BasicBlock.Catch;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Autowired
	private TarrifCalculation tarrifCalculation;

	@Override
	public EmployeeMasterBean employeeLogin(int empId, String password) {
		EntityManager manager = factory.createEntityManager();
		EmployeeMasterBean employeeBean= manager.find(EmployeeMasterBean.class, empId);

		if(employeeBean != null && employeeBean.getPassword().equals(password)) {
			return employeeBean;
		}
		return null;
	}


	@Override
	public long numOfConsumer(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql=" select count(*) from ConsumerMasterBean where region=:region ";
		Query query=manager.createQuery(jpql);
		query.setParameter("region", region);
		long num=(long) query.getSingleResult();
		if(num != 0) {
			return num;
		}
		return 0;
	}

	@Override
	public boolean addEmployee(EmployeeMasterBean employeeBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		boolean isAdded=false;
		try{
			transaction.begin();
			manager.persist(employeeBean);
			transaction.commit();
			isAdded = true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public List<ConsumerMasterBean> showAllConsumers(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql= " from ConsumerMasterBean where region=:region";
		Query query= manager.createQuery(jpql);
		query.setParameter("region", region);

		List<ConsumerMasterBean> consumerList = (List<ConsumerMasterBean>) query.getResultList();
		if(consumerList !=null) {
			return consumerList;
		}
		return null;
	}


	@Override
	public boolean addCurrentBill(CurrentBillBean currentBill) {

		double unitsConsumed = currentBill.getFinalReading() - currentBill.getInitialReading();
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		MonthlyConsumptionBean consumptionBean = new MonthlyConsumptionBean();
		MonthlyConsumptionPK consumptionPK = new MonthlyConsumptionPK();
		CurrentBillBean currentBillBean = manager.find(CurrentBillBean.class, currentBill.getRrNumber());
System.out.println("11"+currentBillBean);
		double totalAmount = tarrifCalculation.billCalculation(unitsConsumed, currentBill.getTypeOfConsumer());
System.out.println("12"+totalAmount);
		try {
			transaction.begin();

		if( currentBillBean != null) {
			manager.remove(currentBillBean);
		}

		consumptionBean.setTotalAmount(totalAmount);
		consumptionBean.setStatus("Not Paid");
		consumptionBean.setInitialReading(currentBill.getInitialReading());
		consumptionBean.setFinalReading(currentBill.getFinalReading());
		consumptionBean.setUnitsConsumed(unitsConsumed);
		consumptionBean.setConsumptionPk(consumptionPK);
		consumptionPK.setDate(new Date());
		consumptionPK.setRrNumber(currentBill.getRrNumber());
		consumptionBean.setConsumptionPk(consumptionPK);

		currentBill.setTotalAmount(totalAmount);
		currentBill.setUnitsConsumed(unitsConsumed);
		currentBill.setDate(new Date());

		manager.persist(consumptionPK);
		manager.persist(consumptionBean);
		transaction.commit();
		return true;
	}catch(Exception e) {
		return false;
	}
}
}
