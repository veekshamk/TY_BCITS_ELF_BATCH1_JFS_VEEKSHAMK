<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
    <spring:url var="css" value="resources/css"/>
     <spring:url var="js" value="resources/js"/>
     <spring:url var="images" value="resources/images"/>
    
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
<nav class="navbar navbar-light bg-light">
    <span class="navbar-brand mb-0 h1" style="color: white; font-family: sans-serif; ">DISCOM ELECTRICITY LIMITED</span>
  </nav>
</head>
<body>
	<div class="box">
        <div class="inner-box">

            <form action="./consumerSignUpPage" >
            <h2>User Registration</h2>

            <label for="">Name:</label>
            <input type="text" name="" id="" placeholder="Your Full Name" required/>
            <label for="">Meter Number:</label>
            <input type="text" name="" id="" maxlength="10" placeholder="Meter Number" required/>
            <label for="">Password:</label>
            <input type="password"
					name="password" id="password" placeholder="Password"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least
             one number and one uppercase and lowercase letter, and at least
              8 or more characters"
					required />
          <!--   <input type="password" name="" id="" placeholder="Password" required/>
 -->            <label for="">Confirm Password:</label>
            <input type="password" name="" id="" placeholder="Confirm Password" required/>
            <label for="">Email Address:</label>
            <input type="email" name="" id="" placeholder="Email Address" required/>
            <label for="">Mobile Number:</label>
            <input type="tel" name="" id="" placeholder="Mobile Number" required>
            <label for="">Address:<label>
            <textarea name="comments" id="" cols="48" rows="5"></textarea>
                
            <div class="inner">
                <label for="region" >Region:</label>
                <select name="region" id="region" >
                    <option value="0" selected disabled>Select</option>
                    <option value="South">Bangalore South</option>
                    <option value="North">Bangalore North</option>
                 </select>

                 <label for="type">Type of Consumer:</label>
                 <select name="type" id="type">
                     <option value="0" selected disabled>select</option>
                     <option value="1">Residential</option>
                     <option value="2">Commercial</option>
                     <option value="3">Industrial</option>
                 </select>
            </div>
                <button type="submit">SignUp</button><a class="SignUp" href=""></a>
                <button type="reset">Clear</button>
            
            
            <p style="text-align: center;">
                <span>Already Register ? </span><a class="link" href="./consumerLoginPage">Log In</a>
            </p>

        </form>
    </div>
        </div>

   <!-- <script src="register.js"></script>  -->

</body>
</html>