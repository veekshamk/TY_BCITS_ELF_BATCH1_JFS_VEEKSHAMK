package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie myCookie=new Cookie("empName", "ThanuShree");
		myCookie.setMaxAge(7 * 24 * 60 * 60); //making cookies persistent for 7 days
		resp.addCookie(myCookie);
		
		PrintWriter out=resp.getWriter();
		out.println("<h1 style='color:blue'>Cookie created successfully!!!</h1>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("./cookiePage.html");
		dispatcher.include(req, resp);
	}

}
