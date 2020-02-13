<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <% String errMsg=(String)request.getAttribute("errMsg");
	String msg=(String)request.getAttribute("msg");%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<%-- <spring:url var="images" value="resources/images" /> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Consumer Login Page</title>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<link rel="stylesheet" href="${css}/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body style="background-color: #c0c0c0;">
		<div class="container">
			<div class="logo">
			</div>
			<div class="main_list" id="mainListDiv" style="font-size: 20px">
				<ul>
					
					<li><a href="./mainHomePage">Home</a></li>
					
					<li><a href="./aboutUsPage">About&nbsp;&nbsp;Us</a></li>
					
					<li><a href="./contactUs">Contact&nbsp;&nbsp;Us</a></li>
				</ul>
			</div>
			<div class="media_button">
				<button class="main_media_button" id="mediaButton">
					<span></span> <span></span> <span></span>
				</button>
			</div>
		</div>

	<div class="box">

		<div class="inner-box">
		
			<form action="./adminHomePage" method="post">
				<h4>ADMIN  LOGIN</h4>

				<label for="name">Email ID:</label> <input type="text" name="email"
					id="email" maxlength="30" placeholder="Enter Email ID" required 
					pattern="[A-Za-z0-9.]+@[A-Za-z0-9]+.[A-Za-z]{1,63}"
					/>
				<br> <label for="password">Password:</label> <input
					type="password" name="password" id="password"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least one number and one uppercase 
					and lowercase letter, and at least 8 or more characters"
					placeholder="Enter Password" required /> <br>
				<button type="submit">Login</button>
				<button type="reset">Reset</button>
			
			</form>
		</div>
	</div><jsp:include page="./footer.jsp"/>
	<% if(msg!=null && !msg.isEmpty()){ %>
	<h2 style="color: #003399;"><%=msg%></h2>
	<%} %>

	<% if(errMsg!=null && !errMsg.isEmpty()){ %>
	<h2 style="color: red;"><%=errMsg %></h2>
	<%} %>
</body>
</html>