<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg=(String)request.getAttribute("msg"); 
    String errMsg=(String)request.getAttribute("errMsg");
    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cookie Page</title>
</head>
<body>
	<a href="./createCookie">Click Here</a> To Create Cookie. <br>
	<a href="./readCookie">Click Here</a> To Read Cookie.
	
	<% if(msg!=null && !msg.isEmpty()) {%>
	<h3 style='color:blue;'><%=msg %></h3>
	<%} %>
	<% if(errMsg!=null && !errMsg.isEmpty()) {%>
	<h3 style='color:red;'><%=errMsg %></h3>
	<%} %>

</body>
</html>