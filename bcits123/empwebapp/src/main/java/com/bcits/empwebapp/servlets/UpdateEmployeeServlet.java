package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.empwebapp.beans.EmployeePrimaryInfo;

public class UpdateEmployeeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empId"));
		String name=req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		HttpSession session=req.getSession(false);
		
		if(session!=null) {
			//Valid session
			//get the form data
			//String empIdVal=req.getParameter("empId");
			//int empId=Integer.parseInt(empIdVal);
			
			//search the record in db
			 EntityManagerFactory emf=Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager=emf.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			
			EmployeePrimaryInfo employeePrimaryInfo=manager.find(EmployeePrimaryInfo.class, empId);
			boolean isAdded=false;
			EmployeePrimaryInfo loggedInEmpInfo=(EmployeePrimaryInfo) session.getAttribute("empInfo");
			
			try {
				transaction.begin();
				employeePrimaryInfo.setName(name);
				transaction.commit();
				isAdded=true;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(isAdded) {
				out.println("<h1 style ='color: green'> Hello "+loggedInEmpInfo.getName()+" </h1> <br>");
				out.println("<a href='employeeform.html' > Home</a>");
				out.println("<h2 style ='color: green'> EmployeeID "+empId +" Not found  </h2> <br>");
				
			}else {
				out.println("<h1 style ='color: red'> Employee ID "+empId +" Not found  </h2> <br>");k
			}
			
//		
		}
		manager.close();
		emf.close();
	
	}
}
