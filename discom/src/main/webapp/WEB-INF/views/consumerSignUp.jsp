<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String errMsg=(String)request.getAttribute("errMsg");
	String msg=(String)request.getAttribute("msg");%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Register</title>
<%-- <link rel="stylesheet" href="${css}/login.css"> --%>
<link rel="stylesheet" href="${css}/register.css">
<!-- As a heading -->
<nav class="navbar navbar-light bg-light"> <span
	class="navbar-brand mb-0 h1"
	style="color: white; font-family: sans-serif;">DISCOM
	ELECTRICITY LIMITED</span> </nav>
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
		<form onsubmit="validation(); return false" id="formData" method="post">

			<!-- <form action="./signUpPage" method="post" > -->
				<h2>User Registration</h2>

				<label for="name">Name:</label>
				 <input type="text" name="fullName" id="fullName" pattern="[A-Za-z\s]{1,15}" maxlength="20" title="It allows only characters and spaces" placeholder="Enter Your Full Name" required />
					
					 <label for="meter">rr Number:</label>
					  <input type="text" name="rrNumber" id="rrNumber" pattern="[a-zA-Z0-9]{1,15}" minlength="10" maxlength="10" placeholder="Enter rr Number" required title="It allows only characters and numbers"/>
				
				<label for="password">Password:</label> 
				<input type="password" name="password" id="password" maxlength="20" placeholder="Enter Password" required
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least one number and one uppercase 
					and lowercase letter, and at least 8 or more characters" />
              
				<label for="cpassword">Confirm Password:</label> 
				<input type="password" name="cpassword" id="cpassword" maxlength="20" placeholder="Confirm Password" required /> 
  				
				<label for="email">Email Address:</label> 
				<input type="email" name="email" id="email" maxlength="50" placeholder="Enter Email Address" required pattern="[A-Za-z0-9.]+@[A-Za-z0-9]+.[A-Za-z]{1,63}" title="Email should be valid "/> 
				
				<label for="mobileNumber">Mobile Number:</label> 
				<input type="tel" name="mobileNumber" id="mobileNumber"
					placeholder="Enter Mobile Number" pattern="[0-9]{10}" minlength="10" maxlength="10" title="Mobile Number allows only 10 digits" required /> 
					
					<label for="address">Address:<label>
						<textarea name="address" id="address" cols="48" rows="5" maxlength="100" required></textarea>

						<div class="inner">
							<label for="region">Region:</label> <select name="region"
								id="region">
								<option value="0" selected disabled>Select</option>
								<option value="Bangalore South">Bangalore South</option>
								<option value="Bangalore North">Bangalore North</option>
							</select> <label for="type">Type of Consumer:</label> <select
								name="typeOfConsumer" id="typeOfConsumer">
								<option value="0" selected disabled>select</option>
								<option value="Residential">Residential</option>
								<option value="Commercial">Commercial</option>
								<option value="Industries">Industries</option>
							</select>
						</div>
						<button type="submit" formaction="./signUpPage" value="submit" >SignUp</button> <!-- <a class="SignUp" href="./signUpPage"></a> -->
						 <button type="reset">Clear</button>  <p style="text-align: center;">
                <span>Already Register ? </span><a class="link" href="./consumerLoginPage">Log In</a>
            </p> 
            
            
            
			</form>
		</div>
	</div>
	
	<srcipt src="${js}/consumerSignUp.js"></srcipt> 
	<% if(msg!=null && !msg.isEmpty()){ %>
	<h2 style="color: #003399;"><%=msg%></h2>
	<%} %>

	<% if(errMsg!=null && !errMsg.isEmpty()){ %>
	<h2 style="color: red;"><%=errMsg %></h2>
	<%} %>
	<jsp:include page="./footer.jsp"/>
	
<!-- pattern=".+@gmail.com" size="30" -->
</body>
</html>