<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <% EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) session.getAttribute("employeeInfoBean"); 
     String errMsg=(String) request.getAttribute("errMsg"); 
     %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table border="1px" style="width:90%";>
		<thead style="background: navy; color: white;">
		<tr style="height: 50px">
			<th>empId</th>
			<th>bloodGroup</th>
			<th>deptId</th>
			<th>designation</th>
			<th>dob</th>
			<th>doj</th>
			<th>managerId</th>
			<th>mobileNumber</th>
			<th>name</th>
			<th>officialMailId</th>
			<th>password</th>
			<th>salary</th>
			</tr>
			</thead>
			<tbody>
			<% for(EmployeeInfoBean employeeInfoBean: empInfoList){ %>
				<tr style="height: 40px">
				<td><%=employeeInfoBean.getBloodGroup() %></td>
				<td><%=employeeInfoBean.getDeptId() %></td>
				<td><%=employeeInfoBean.getDesignation() %></td>
				<td><%=employeeInfoBean.getDob() %></td>
				<td><%=employeeInfoBean.getDoj() %></td>
				<td><%=employeeInfoBean.getEmpId() %></td>
				<td><%=employeeInfoBean.getManagerId() %></td>
				<td><%=employeeInfoBean.getMobileNumber()%></td>
				<td><%=employeeInfoBean.getName()%></td>
				<td><%=employeeInfoBean.getOfficialMailId()%></td>
				<td><%=employeeInfoBean.getPassword() %></td>
				<td><%=employeeInfoBean.getSalary()%></td>
				
			<%} %>
			
			</tbody>
		</table>
		<%}else{ %>
		<h2 style="color: red">No Record To display....</h2>
		<%} %>
	
	</div>
	<% if(errMsg!=null && !errMsg.isEmpty()) {%>
	<h3 style='color:red;'><%=errMsg%></h3>
	<%} %>

</body>
</html>