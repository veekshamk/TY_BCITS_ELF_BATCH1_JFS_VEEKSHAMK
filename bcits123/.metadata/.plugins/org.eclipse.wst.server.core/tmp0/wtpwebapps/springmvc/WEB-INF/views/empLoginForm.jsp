<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String errMsg=(String) request.getAttribute("errMsg"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management Portal</title>
</head>
<body>

	<% if(errMsg!=null && !errMsg.isEmpty()) {%>
	<h3 style='color:red;'><%=errMsg%></h3>
	<%} %>
	
	<fieldset>
	<legend>Employee Login</legend>
	<form action="./login" method="post">
		<table>
			<tr>
				<td>Employee ID</td>
				<td>:</td>
				<td><input type="text" name="empId"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><br>
				<input type="submit">
				</td>
			</tr>
		
		</table>
	</form>
	
	</fieldset>

</body>
</html>
<br><br>
<jsp:include page="footer.jsp"/>