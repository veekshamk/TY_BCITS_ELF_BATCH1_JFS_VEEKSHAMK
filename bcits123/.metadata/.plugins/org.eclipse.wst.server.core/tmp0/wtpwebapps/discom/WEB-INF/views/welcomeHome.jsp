<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${css}/home.css">
</head>
<body>
	<form action="./homePage" >

		<h1 style="color: black; text-align: center;">Welcome To DISCOM
			ELECTRICITY LIMITED</h1>

		<br> <br>
		<br>
		<br> <br>
		<br>
		<br> <br>
		<br>
		<br> <br>
		<br> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
		
		<!-- <button type="submit">Consumer Login</button>
		<a class="login1" href="./consumerLoginPage"></a> -->
		
		<a href="./consumerLoginPage" class="btn btn-primary btn-lg disabled"
			role="button" aria-disabled="true">Consumer Login</a> 
			<a href="./employeeLoginPage" class="btn btn-primary btn-lg disabled"
			role="button" aria-disabled="true">Employee Login</a>
		</div>

	</form>
</body>
</html>