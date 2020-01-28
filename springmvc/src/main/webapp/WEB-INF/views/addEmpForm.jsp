<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%     String msg=(String) request.getAttribute("msg");
String errMsg=(String) request.getAttribute("errMsg");
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Add Employee</legend>
		<form action="./addEmployee" method="post">
			<label>Emp ID</label> 
			<input type="number" name="empId" required> <br>
			<label>Name</label> 
			<input type="text" name="name" required><br>
			<label>Mobile Number</label> 
			<input type="tel" name="mobileNumber" required><br>
			<label>Blood Group</label> 
			<input type="text" name="bloodGroup" required> <br>
			<label>Dept ID</label> 
			<input type="number" name="deptId" required> <br>
			<label>Designation</label>
			<input type="text" name="designation" required> <br>
			<label>DOB</label>
			<input type="date" name="dob" required> <br>
			<label>DOJ</label> 
			<input type="date" name="doj" required> <br>
			<label>Manager ID</label> 
			<input type="number" name="managerId" required> <br>
			<label>Mail ID</label>
			<input type="text" name="officialMailId" required> <br>
			<label>Password</label>
			<input type="text" name="password" required><br>
			<label>Salary</label>
			<input type="number" name="salary" required> <br>
			
			&nbsp;&nbsp;&nbsp;&nbsp;
			
			<input type="submit" value="Add">

		</form>
	</fieldset>

	<% if(msg!=null && !msg.isEmpty()){ %>
	<h2 style="color: green;"><%=msg %></h2>
	<%} %>

	<% if(errMsg!=null && !errMsg.isEmpty()){ %>
	<h2 style="color: red;"><%=errMsg %></h2>
	<%} %>
</body>
</html>