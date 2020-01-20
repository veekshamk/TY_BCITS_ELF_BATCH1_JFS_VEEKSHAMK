<%@page import="com.bcits.empwebapp.beans.EmployeePrimaryInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%List<EmployeePrimaryInfo> employeeList=(List<EmployeePrimaryInfo>) request.getAttribute("employeeList"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%if(employeeList!=null){ %>
	<table border="1" style="width: 80%">
	<thead style="background:pink; color: white;">
	<tr style="height: 35px">
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Designation</th>
	<th>Salary</th>
	<th>Mobile Number</th>
	<th>Email ID</th>
	<th>Department ID</th>
	</tr>
	</thead>
	<tbody>
	<% for(EmployeePrimaryInfo empInfo: employeeList){ %>
	<tr style="height: 30px">
	<td><%=empInfo.getEmpId() %></td>
	<td><%=empInfo.getName() %></td>
	<td><%=empInfo.getDesignation() %></td>
	<td><%=empInfo.getSalary() %></td>
	<td><%=empInfo.getMobileNumber() %></td>
	<td><%=empInfo.getEmpId() %></td>
	<td><%=empInfo.getDeptId() %></td>
	</tr>
	<%} %>
	</tbody>
	</table>
	
	
	<% }else{ %>
	<h2 style="color: red;">No records to display!!!</h2>
	<%} %>

</body>
</html>