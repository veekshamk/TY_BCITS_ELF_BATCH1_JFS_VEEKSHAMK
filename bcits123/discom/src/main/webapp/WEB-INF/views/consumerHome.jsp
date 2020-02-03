<%@page import="com.bcits.discom.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<% ConsumerMasterBean consumerBean= 
		(ConsumerMasterBean) session.getAttribute("loggedInCons"); %>
    
<!DOCTYPE html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Consumer Login Page</title>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<link rel="stylesheet" href="${css}/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  >
<title>Insert title here</title>
</head>
<body>
<h1 style="color: white;">Account Details</h2>
<br>
<br>
<table style="color: white; font-size: 20px">
	<thead style="color: white;">
	<tr style="color: white;">
		<th scope="col" style="color: white; width: 170px">Name</th>
		<th scope="col" style="color: white; width: 270px">Email ID</th>
		<th scope="col" style="color: white; width: 170px">rr Number</th>
		<th scope="col" style="color: white; width: 170px">Phone Number</th>
		<th scope="col" style="color: white; width: 120px">Region</th>
		<th scope="col" style="color: white; width: 270px">Type of Consumer</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td style="color: white;"><%= consumerBean.getFullName() %></td>
		<td style="color: white;"><%=consumerBean.getEmail() %></td>
		<td style="color: white;"><%=consumerBean.getRrNumber() %></td>
		<td style="color: white;"><%=consumerBean.getPhoneNumber()%></td>
		<td style="color: white;"><%=consumerBean.getRegion() %></td>
		<td style="color: white;"><%= consumerBean.getTypeOfConsumer() %>
	
	</tr>
	
	</tbody>

</table>
	
  <br>
  <br>
  <br>
  <pre>
  <table class="home">
    <tr>
      <td>
                  <a href="./consumerBillDisplay" style="color: white;font-size: 25px">Current Bill</a>
      </td>
    </tr>
    <tr>
      <td>
                  <a href="" style="color: white;font-size: 25px">Monthly Consumption</a>
      </td>
    </tr>
    <tr>
      <td>
                  <a href="" style="color: white;font-size: 25px">Bill History</a>
      </td>
    </tr>
    <tr>
      <td>
                  <a href="" style="color: white;font-size: 25px">Pay Online</a>
      </td>
    </tr>
  </table>
  </pre>


</body>
</html>