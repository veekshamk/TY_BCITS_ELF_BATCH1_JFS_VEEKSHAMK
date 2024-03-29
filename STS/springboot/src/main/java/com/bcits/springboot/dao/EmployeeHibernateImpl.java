package com.bcits.springboot.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.springboot.beans.EmployeeInfoBean;

@Repository
public class EmployeeHibernateImpl implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	//	@PersistenceContext
	//	private EntityManager manager;
	//	
	
	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		boolean isAdded=false;
		try {
			transaction.begin();
			manager.persist(bean);
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
		boolean isDeleted=false;

		EntityManager manager=factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empId);

		if(employeeInfoBean != null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.remove(employeeInfoBean);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return false;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		int empId=bean.getEmpId();
		String bloodGroup=bean.getBloodGroup();
		int deptId=bean.getDeptId();
		String designation=bean.getDesignation();
		Date dob=bean.getDob();
		Date doj=bean.getDoj();
		int managerId=bean.getManagerId();
		long mobileNumber=bean.getMobileNumber();
		String name=bean.getName();
		String officialMailId=bean.getOfficialMailId();
		String password=bean.getPassword();
		double salary=bean.getSalary();

		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empId);

		if(employeeInfoBean !=null) {
			try {
				transaction.begin();
				if(bloodGroup!=null) {
					employeeInfoBean.setBloodGroup(bloodGroup);
				}
				if(deptId !=0) {
					employeeInfoBean.setDeptId(deptId);
				}
				if(designation !=null) {
					employeeInfoBean.setDesignation(designation);
				}
				if(dob!=null) {
					employeeInfoBean.setDob(dob);
				}
				if(doj!=null) {
					employeeInfoBean.setDoj(doj);
				}
				if(empId!=0) {
					employeeInfoBean.setEmpId(empId);
				}
				if(managerId !=0) {
					employeeInfoBean.setManagerId(managerId);
				}
				if(mobileNumber !=0) {
					employeeInfoBean.setMobileNumber(mobileNumber);
				}
				if(name!=null) {
					employeeInfoBean.setName(name);
				}
				if(officialMailId!=null) {
					employeeInfoBean.setOfficialMailId(officialMailId);
				}
				if(password!=null) {
					employeeInfoBean.setPassword(password);
				}
				if(salary!=0) {
					employeeInfoBean.setSalary(salary);
				}

				transaction.commit();
				return true;
			}catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();

			}finally {
				manager.close();
			}
		}

		return false;
	}


	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager=factory.createEntityManager();

		String jpql=" from EmployeeInfoBean ";
		Query query= manager.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<EmployeeInfoBean> list=query.getResultList();
		manager.close();

		return list;
	}

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		EntityManager manager=factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empId);
		manager.close();
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager manager=factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empId);

		if(employeeInfoBean!=null && employeeInfoBean.getPassword().equals(password)) {
			return employeeInfoBean;
		}else {
			return null;
		}
	}

}
