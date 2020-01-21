package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.empwebapp.beans.EmployeePrimaryInfo;

@WebServlet("/getEmployee")
public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//validate the session
		HttpSession session= req.getSession(false);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		EntityManagerFactory emf=null;
		EntityManager manager=null;
		
		if(session!=null) {
			//Valid session
			//get the form data
			String empIdVal=req.getParameter("empId");
			int empId=Integer.parseInt(empIdVal);
			
			//search the record in db
			 emf=Persistence.createEntityManagerFactory("emsPersistenceUnit");
			 manager=emf.createEntityManager();
			EmployeePrimaryInfo employeePrimaryInfo=manager.find(EmployeePrimaryInfo.class, empId);
		
		if(employeePrimaryInfo!=null) {
			//display employee record
			EmployeePrimaryInfo loggedEmpInfo=(EmployeePrimaryInfo) session.getAttribute("empInfo");
			
			out.println("<html>");
			out.println("<body>");
			
			out.println("<h1>Hello " +loggedEmpInfo.getName()+ "!</h1>");
			
			out.println("<h1 style='color:green'>Employee ID "+ empId + " Found-</h1>");
			out.println("Name= " +employeePrimaryInfo.getName());
			out.println("<br>Dept ID= " +employeePrimaryInfo.getDeptId());
			out.println("<br>Designation= " +employeePrimaryInfo.getDesignation());
			out.println("<br>Salary= " +employeePrimaryInfo.getSalary());
			out.println("</body>");
			out.println("</html>");
		
		
		}else {
			//display empId not found
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Please Login First</h1>");
			out.println("</body>");
			out.println("</html>");
			req.getRequestDispatcher("./loginform.html").include(req, resp);
		}
		}
		manager.close();
		emf.close();
	}
}
