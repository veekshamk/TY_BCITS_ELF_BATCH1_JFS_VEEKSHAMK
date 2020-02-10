package com.bcits.springsecurityrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.springsecurityrest.beans.EmpInfoBean;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(EmpInfoBean empBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		boolean isRegistered = false;

		try {
			transaction.begin();
			manager.persist(empBean);
			transaction.commit();
			isRegistered = true;
		}catch (Exception e) {
			transaction.rollback();
		}finally {
			manager.close();
		}
		return isRegistered;
	}

	@Override
	public EmpInfoBean getEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		EmpInfoBean empBean = manager.find(EmpInfoBean.class, empId);
		manager.close();

		return empBean;
	}

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from EmpInfoBean ");
		List<EmpInfoBean> employeeList = query.getResultList();
		manager.close();

		return employeeList;
	}

}
