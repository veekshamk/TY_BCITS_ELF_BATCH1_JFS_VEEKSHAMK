<%@page import="com.bcits.springsecuritymvc.beans.EmpInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:include page="./header.jsp"/>
    
    <% List<EmpInfoBean> employeeList = (List<EmpInfoBean>)  request.getAttribute("employeeList");%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Spring Security - See All Employees </title>
</head>
<body>
	<div>
		<% if(employeeList != null && !employeeList.isEmpty()){ %>
			<table>
				<thead>
					<tr style="background: navy; color: white;">
						<th>Employee ID</th>
						<th>Employee Name</th>
						<th>Password</th>
						<th>Role</th>
					</tr>
				</thead>
				<tbody>
				<% for(EmpInfoBean empBean : employeeList){ %>
					<tr>
						<td><%=empBean.getEmpId() %></td>
						<td><%=empBean.getName() %></td>
						<td><%=empBean.getPassword() %></td>
						<td><%=empBean.getRole() %></td>
					</tr>
					<% } %>
				</tbody>
			</table>
			<%}else{ %>
			<h3>No records to display</h3>
			<%} %>
					
</div>
</body>
</html>