package com.bcits.jpawithhibernate.jpql.staticquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernate.common.bean.EmployeePrimaryInfo;

public class FindName {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("test");
		EntityManager m= emf.createEntityManager();

		String jpql=" select name from EmployeePrimaryInfo ";
		Query query= m.createQuery(jpql);

		List<String> list= query.getResultList();
		for (String employeePrimaryInfo : list) {
			System.out.println("Name=>"+employeePrimaryInfo);

		}
	}

}



