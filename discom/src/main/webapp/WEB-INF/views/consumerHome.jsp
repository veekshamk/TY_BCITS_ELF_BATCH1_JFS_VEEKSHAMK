<%@page import="com.bcits.discom.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String errMsg=(String)request.getAttribute("errMsg");
	String msg=(String)request.getAttribute("msg");%>

<%
	ConsumerMasterBean consumerBean = (ConsumerMasterBean) session.getAttribute("loggedInConsumer");
%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="${css}/mainHome.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DISCOM MAIN HOME PAGE</title>
</head>
<body>
	
		<nav class="nav">
		<div class="container">
			<div class="logo">
				<a href="#" style="font-size: 30px">DISCOM&nbsp;&nbsp;PRIVATE&nbsp;&nbsp;LIMITED</a>
			</div>
			<div class="main_list" id="mainListDiv" style="font-size: 20px">
				<ul>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="./mainHomePage">Home</a></li>
					<li><a href="#"></a></li>
					<li><a href="./aboutUsPage">About&nbsp;&nbsp;Us</a></li>
					<li><a href="#"></a></li>
					<li><a href="./contactUs">Contact&nbsp;&nbsp;Us</a></li>
					<li><a href="#"></a></li>
					<li><a href="./consumerLogout">Logout</a></li>
				</ul>
			</div>
			<div class="media_button">
				<button class="main_media_button" id="mediaButton">
					<span></span> <span></span> <span></span>
				</button>
			</div>
		</div>
		</nav>

		<section class="home"> <br>
		
		<br>
		<br>
		<br>
		
		<ul class="list-group" style="width: 300px; font-size: 25px">
			<li class="list-group-item active">Account Details</li>
			<li class="list-group-item"><a href="./consumerBillDisplay">Current
					Bill</a></li>
			<li class="list-group-item"><a href="./monthlyConsumption">Monthly
					Consumption</a></li>
			<li class="list-group-item"><a href="./billHistory">Bill
					History</a></li>
			<li class="list-group-item"><a href="./payment">Pay Online</a></li>
		</ul>



		<div class="table-responsive text-nowrap">

			<h1 style="font-weight: 10px">ACCOUNT DETAILS</h1>

			<table class="table">

				<tbody style="font-size: 25px">
					<tr>
						<td>Consumer Name</td>
						<td>:</td>
						<td><%=consumerBean.getFullName() %></td>
					</tr>
					<tr>
						<td>RR Number</td>
						<td>:</td>
						<td><%=consumerBean.getRrNumber() %></td>
					</tr>
					<tr>
						<td>Email ID</td>
						<td>:</td>
						<td><%=consumerBean.getEmail() %></td>
					</tr>
					<tr>
						<td>Mobile Number</td>
						<td>:</td>
						<td><%=consumerBean.getMobileNumber() %></td>
					</tr>
					<tr>
						<td>Region</td>
						<td>:</td>
						<td><%=consumerBean.getRegion() %></td>
					</tr>
					<tr>
						<td>Type Of Consumer</td>
						<td>:</td>
						<td><%=consumerBean.getTypeOfConsumer() %></td>
					</tr>
				</tbody>
			</table>
  
    <form action="./query" >
    <div class="form-group" style="width: 500px; font-size: 20px ;">
  		<label for="comment"><strong >Write your Query:</strong></label>
 		<textarea type="text" name="query" class="form-control" rows="5" id="query" ></textarea><br>
 		<button type="submit" class="btn btn-primary" style="margin-top: -7px;">Submit</button>
	</div> 
	</form>

		</div>
		<% if(msg!=null && !msg.isEmpty()){ %>
		<h2 style="color: #003399;"><%=msg%></h2>
		<%} %> <% if(errMsg!=null && !errMsg.isEmpty()){ %>
		<h2 style="color: red;"><%=errMsg %></h2>
		<%} %> 
		<jsp:include page="./footer.jsp"/>
		</section>



</body>
</html>