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
	<div class="box">
		<div class="inner-box">

			<form action="./signUpPage" method="post" onclick="Validate()">
				<h2>User Registration</h2>

				<label for="name">Name:</label>
				 <input type="text" name="fullName" id="fullName" placeholder="Enter Your Full Name" required />
					
					 <label for="meter">rr Number:</label>
					  <input type="text" name="rrNumber" id="rrNumber" maxlength="10" placeholder="Enter rr Number" required title="RR Number should not exceed 10 digits"/>
				
				<label for="password">Password:</label> 
				<input type="password" name="password" id="password" placeholder="Enter Password" required
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least one number and one uppercase 
					and lowercase letter, and at least 8 or more characters" />
              
				<label for="cpassword">Confirm Password:</label> 
				<input type="password" name="cpassword" id="cpassword" placeholder="Confirm Password" required /> 
				
				<label for="email">Email Address:</label> 
				<input type="email" name="email" id="email" placeholder="Enter Email Address" required pattern=".+@gmail.com" size="30" title="Email should be valid "/> 
				
				<label for="mobileNumber">Mobile Number:</label> 
				<input type="tel" name="mobileNumber" id="mobileNumber"
					placeholder="Enter Mobile Number" pattern="[0-9]{10}" title="Mobile Number should contain 10 digits" required /> 
					
					<label for="address">Address:<label>
						<textarea name="address" id="address" cols="48" rows="5" required></textarea>

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
						<button type="submit" value="submit" >SignUp</button> <!-- <a class="SignUp" href="./signUpPage"></a> -->
						 <button type="reset">Clear</button>  <p style="text-align: center;">
                <span>Already Register ? </span><a class="link" href="./consumerLoginPage">Log In</a>
            </p> 
            
         
    




			</form>
		</div>
	</div>
	<% if(msg!=null && !msg.isEmpty()){ %>
	<h2 style="color: #003399;"><%=msg%></h2>
	<%} %>

	<% if(errMsg!=null && !errMsg.isEmpty()){ %>
	<h2 style="color: red;"><%=errMsg %></h2>
	<%} %>
	<jsp:include page="./footer.jsp"/>
	<srcipt src="${js}/consumerSignUp.js"></srcipt> 

</body>
</html>