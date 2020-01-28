<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>Sign Up</legend>
	<form action="./addConsumer" method="post">
	<label>Meter Number:</label>
	<input type="text" name="meterNumber" required> <br>
	<label>Password:</label>
	<input type="text" name="password" required> <br>
	<label>Name:</label>
	<input type="text" name="name" required> <br>
	<label>Confirm Password:</label>
	<input type="text" name="confirmPassword" required><br>
	<label>Email Address:</label>
	<input type="text" name="emailAddress" required><br>
	<label>Mobile Number:</label>
	<input type="tel" name="mobileNumber" required> <br>
	<label>Address</label>
	<input type="text" name="address" required> <br>
	<label>Region:</label>
	<input type="text" name="region" required> <br>
	<label>Type of Consumer:</label>
	<input type="text" name="typeOfConsumer" required> <br>
	&nbsp;&nbsp;
	<input type="submit" value="add">
	</form>
	</fieldset>

</body>
</html>