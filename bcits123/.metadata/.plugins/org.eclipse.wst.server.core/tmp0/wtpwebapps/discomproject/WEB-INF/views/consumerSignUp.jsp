<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
    <link rel="stylesheet" href="./css/register.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div class="box">
        <div class="inner-box">
            <form action="login.html" method="post">
            <h2>User Registration</h2>

            <label for="">Name:</label>
            <input type="text" name="" id="" placeholder="Your Full Name" required/> <br>
            <label for="">Meter Number:</label>
            <input type="number" name="" id="" placeholder="Meter Number" required/><br>
            <label for="">Password:</label>
            <input type="password" name="" id="" placeholder="Password" required/><br>
            <label for="">Confirm Password:</label>
            <input type="password" name="" id="" placeholder="Confirm Password" required/><br>
            <label for="">Email Address:</label>
            <input type="email" name="" id="" placeholder="Email Address" required/><br>
            <label for="">Mobile Number:</label>
            <input type="tel" name="" id="" placeholder="Mobile Number" required><br>
            <label for="">Address:<label>
            <textarea name="comments" id="" cols="48" rows="5"></textarea>

            <div class="inner">
                <label for="region" >Region:</label>
                <select name="region" id="region" >
                    <option value="0" selected disabled>Select</option>
                    <option value="South">Bangalore South</option>
                    <option value="North">bangalore North</option>
                 </select>
                 <label for="type">Type of Consumer:</label>
                 <select name="type" id="type">
                     <option value="0" selected disabled>select</option>
                     <option value="1">Residential</option>
                     <option value="2">Commercial</option>
                     <option value="3">Industrial</option>
                 </select>
            </div>
                <button type="submit">SignUp</button><a class="SignUp" href="login.html"></a>
                <button type="reset">Clear</button>
            <p style="text-align: center;">
                <span>Already Register ? </span><a class="link" href="login.html">Log In</a>
            </p>

        </form>
    </div>
        </div>
   <!-- <script src="register.js"></script>  -->
</body>
</div>
</html>