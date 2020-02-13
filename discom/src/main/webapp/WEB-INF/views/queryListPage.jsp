<%@page import="com.bcits.discom.beans.QueryBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 
    <% String errMsg = (String) request.getAttribute("errMsg"); %>
  <%String msg = (String) request.getAttribute("msg"); %>
<% List<QueryBean> queryRequests = (List<QueryBean>) request.getAttribute("query"); %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta charset="ISO-8859-1">
</head>
<body>
	
		<nav class="nav">
		<div class="container">
			<div class="logo">
				<a href="#">DISCOM&nbsp;&nbsp;PRIVATE&nbsp;&nbsp;LIMITED</a>
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
					<li><a href="./employeeLogout">Logout</a></li>
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
		<ul class="list-group" style="width: 320px; font-size: 25px">
			<li class="list-group-item active">Employee Details</li>
			<li class="list-group-item"><a href="./consumerList">Show
					All Consumers</a></li>
			<li class="list-group-item"><a href="./generatePage">Electricity
					Bill Generation</a></li>
			<li class="list-group-item"><a href="./listOfBills">Show All
					Bills</a></li>
			<li class="list-group-item"><a href="./seeQueryDetails">See All Queries</a></li>
			<li class="list-group-item"><a href="./monthlyRevenue">Monthly Revenue</a></li>
		</ul>
	<div class="table-responsive text-nowrap">
		<h1 style="font-size: 30px">QUERY DETAILS</h1>
		<table class="table">
			<thead style="font-size: 20px">
				<th>Date</th>
				<th>RR Number</th>
				<th>Request</th>
				<th>Response</th>
			</thead>
			<tbody style="font-size: 20px">

				<% if(queryRequests != null) { %>
    <%
  for( QueryBean queries :queryRequests) { %><tr>
       <form action="./sendResponse" method="post">
      
      <input type="datetime" name="date" value="<%=queries.getQueryPk().getDate()%>" hidden="true" />
      <%SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); %>
      <td><strong><%= formatter.format(queries.getQueryPk().getDate()) %></strong></td>
      <input type="text" name="rrNumber" value="<%= queries.getQueryPk().getRrNumber() %>" hidden="true"  />
      <td><strong><%= queries.getQueryPk().getRrNumber() %></strong></td>
      <td><strong><%= queries.getQueryRequest() %></strong></td>
      <td><strong><%= queries.getQueryResponse() %></strong></td>
      <td><textarea class="form-control"  rows="2" id="query" name ="query"></textarea></td> 
 	  <td><button type="submit" class="btn btn-primary">Send</button></td>
 	  
					</tr>
				</form>
				<%
						}
					%>
				<%} %>

			</tbody>
		</table>
		</div>
		
		
		
		<%
			if (msg != null && !msg.isEmpty()) {
		%>
		<h2 style="color: #003399;"><%=msg%></h2>
		<%
			}
		%> <%
 	if (errMsg != null && !errMsg.isEmpty()) {
 %>
		<h2 style="color: red;"><%=errMsg%></h2>
		<%
			}
		%> <!-- </div> --> </section>
		<jsp:include page="./footer.jsp"/>
	
</body>
</html>


    