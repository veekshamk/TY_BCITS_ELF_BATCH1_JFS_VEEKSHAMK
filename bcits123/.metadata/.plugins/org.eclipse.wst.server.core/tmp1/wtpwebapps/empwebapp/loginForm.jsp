<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg= (String) request.getAttribute("msg");%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>Employee Login</legend>
	<form action="./login2" method="post">
	<label> Employee ID: </label>
	<input type="text" name="empId" required>
	&nbsp;&nbsp;<br>
	<label>Password:</label>
	<input type="password" name="password" required>
	&nbsp;&nbsp;
	<input type="submit" value="Login">
	</form>
	</fieldset>
	
	<%if(msg!=null && !msg.isEmpty()){ %>
		<h3 style="color:maron;"><%=msg %></h3>
	<%} %>
	

</body>
</html>