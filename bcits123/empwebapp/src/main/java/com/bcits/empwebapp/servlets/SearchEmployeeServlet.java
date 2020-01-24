package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal=req.getParameter("empId");
		
		ServletConfig config=getServletConfig();
		String myConfigVal=config.getInitParameter("servletName");
		
		ServletContext context=getServletContext();
		String myContextVal=context.getInitParameter("appName");
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Emp ID= "+empIdVal+ "</h1>");
		out.print("Emp Name= Veeksha M K<br>");
		out.print("Emp Age= 23<br>");
		out.print("Designation= Software Developer<br>");
		out.print("Salary= 20000/-");
		out.println("<h3>Servlet name= "+myConfigVal);
		out.println("<h3>App name= "+myContextVal);
		out.print("</body>");
		out.print("</html>");
		
	}

}