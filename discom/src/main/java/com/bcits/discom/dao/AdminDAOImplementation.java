package com.bcits.discom.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.discom.beans.AdminBean;
import com.bcits.discom.beans.EmployeeMasterBean;
@Repository
public class AdminDAOImplementation implements AdminDAO{
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addEmployee(EmployeeMasterBean employeeBean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		boolean isAdded=false;
		try {
			transaction.begin();
			manager.persist(employeeBean);
			transaction.commit();
			isAdded=true;
		}catch(Exception e) {
			e.printStackTrace();
			isAdded=false;
		}finally {
			manager.close();
		}
		return isAdded;
	}
		
	

	@Override
	public boolean deleteEmployee(int empId) {
		return false;
	}

	@Override
	public AdminBean adminLogin(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from AdminBean where email= :email ");
		query.setParameter("email", email);
		AdminBean adminBean = (AdminBean) query.getSingleResult();
		if(adminBean != null && adminBean.getPassword().equals(password)) {
			return adminBean;
		}
		return null;
	}
	

}
