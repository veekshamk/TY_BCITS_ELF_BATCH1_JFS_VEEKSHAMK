<%@page import="com.bcits.empwebapp.beans.EmployeePrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%EmployeePrimaryInfo employeePrimaryInfo
    = (EmployeePrimaryInfo) request.getAttribute("empInfo"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>Search Employee</legend>
	<!-- <form action="./searchEmployee"> -->
	<!-- <form action="./getEmployee"> -->
	<form action="./getEmp">
	<label>Employee ID:</label>
	<input type="text" name="empId" required>
	&nbsp;&nbsp;
	<input type="submit" value="Search">
	</form>
	</fieldset>
	
	<h1>Search Result</h1>
	<%if(employeePrimaryInfo!=null){ %>
		Name=<%=employeePrimaryInfo.getName() %>
		Designation=<%=employeePrimaryInfo.getDesignation() %>
	<%}else{ %>
	<h2 style="color:red">Emplooyee ID not Found</h2>
	<%} %>

</body>
</html>