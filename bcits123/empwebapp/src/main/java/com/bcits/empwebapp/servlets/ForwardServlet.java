package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url="./date.html"; //static resource
		String url="./currentDate"; //dynamic resource
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>hello</h2>");
		out.println("</body>");
		out.println("</html>");
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher(url);
		requestDispatcher.forward(req, resp);
	}

}
