<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg=(String) request.getAttribute("msg");
    String errMsg=(String) request.getAttribute("errMsg");
    %>
    
    
    
    <jsp:include page="header.jsp"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management Portal</title>
</head>
<body>
	<fieldset>
		<legend>Delete Employee</legend>
		<form action="./delete" >
		
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit" name="delete">
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>

<%if(errMsg !=null && !errMsg.isEmpty()){ %>
<h3 style="color:red"><%=errMsg %></h3>
<%} %>
<%if(msg !=null && !msg.isEmpty()){ %>
<h3 style="color: red"><%=msg %></h3>
<%} %>