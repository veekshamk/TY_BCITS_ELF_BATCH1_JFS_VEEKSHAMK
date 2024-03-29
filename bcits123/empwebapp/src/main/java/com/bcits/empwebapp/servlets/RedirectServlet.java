package com.bcits.empwebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url="https://www.google.com"; //to external resource
		String url="http://localhost:8080/empwebapp/currentDate"; //to internal resource (dynamic)
		//String url="http://localhost:8080/empwebapp/date.html"; //to internal resource (static)
		
		resp.sendRedirect(url);
	}

}
