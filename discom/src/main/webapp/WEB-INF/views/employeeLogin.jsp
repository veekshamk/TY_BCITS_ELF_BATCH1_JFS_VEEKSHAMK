<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String errMsg = (String) request.getAttribute("errMsg");
	String msg = (String) request.getAttribute("msg");
%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Consumer Login Page</title>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->

<link rel="stylesheet" href="${css}/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div class="box">

		<div class="inner-box">

			<form action="./empLoginPage" method="post">
				<h4>EMPLOYEE LOGIN</h4>

				<label for="employeeId">Employee ID:</label> <input type="number"
					name="empId" id="empId" placeholder="Employee ID" required /> <br>
				<label for="password">Password:</label> <input type="password"
					name="password" id="password" placeholder="Password"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least
             one number and one uppercase and lowercase letter, and at least
              8 or more characters"
					required /> <br>
				<button type="submit">Login</button>
				 <a class="login" href=""></a>
				<button type="reset">Reset</button>

			</form>
		</div>
	</div>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2 style="color: #003399;"><%=msg%></h2>
	<%
		}
	%>

	<%
		if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h2 style="color: red;"><%=errMsg%></h2>
	<%
		}
	%>
	<jsp:include page="./footer.jsp"/>
</body>
</html>
