<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	    <div class="box">

        <div class="inner-box">
            

            <form action="/welcome.html" method="post">
            <h4>CUSTOMER LOGIN</h4>
            

            
            <label for="name">Meter Number:</label>
            <input type="text" name="name" id="name" placeholder="Meter Number" required/> <br>
            <label for="password">Password:</label> 
            <input type="password" name="password" id="password" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least
             one number and one uppercase and lowercase letter, and at least
              8 or more characters" required/> <br>
            
              <button type="submit">Login</button><a class="login" href="welcome.html"></a>
              <button type="reset">Reset</button>

                <!-- <div id="message">
                    <h3>Password must contain the following:</h3>
                    <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
                    <p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
                    <p id="number" class="invalid">A <b>number</b></p>
                    <p id="length" class="invalid">Minimum <b>8 characters</b></p>
                </div> -->

            <p style="text-align: center;">
                <span>Not a registered customer? </span><a class="link" href="register.html">Register Here</a>
            </p>

            <span class="forgot"><a href="forgot.html">Forgot Password?</a></span>

        </form>
    
        </div>

    </div>
    

</body>
</html>