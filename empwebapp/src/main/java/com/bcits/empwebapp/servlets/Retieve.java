package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.beans.EmployeePrimaryInfo;

@WebServlet("/retrieveAll")
public class Retieve extends HttpServlet {
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager = factory.createEntityManager();
			
			String jpql = "from EmployeePrimaryInfo";

			Query query = manager.createQuery(jpql);
			List<EmployeePrimaryInfo> list = query.getResultList();

			for (EmployeePrimaryInfo employeePrimaryInfo : list) {

				System.out.println("employee_Id......." + employeePrimaryInfo.getEmpId());
				System.out.println("employee_Name....." + employeePrimaryInfo.getName());
				System.out.println("employee_MobileNo." + employeePrimaryInfo.getMobileNumber());
				System.out.println("official_mailid   " + employeePrimaryInfo.getOfficialMailId());
				System.out.println("date of birth ==  " + employeePrimaryInfo.getDob());
				System.out.println("date of joing ==  " + employeePrimaryInfo.getDoj());
				System.out.println("designation ==    " + employeePrimaryInfo.getDesignation());
				System.out.println("blood_group==     " + employeePrimaryInfo.getBloodGroup());
				System.out.println("salary==          " + employeePrimaryInfo.getSalary());
				System.out.println("dept_id==         " + employeePrimaryInfo.getDeptId());
				System.out.println("manger_id==       " + employeePrimaryInfo.getManagerId());
				System.out.println("=================================================");
			}

			manager.close();

		}

	
}


