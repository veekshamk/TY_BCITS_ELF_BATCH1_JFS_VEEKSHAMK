<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.bcits.discom.beans.BillHistoryBean"%>
<%@page import="com.bcits.discom.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String errMsg=(String)request.getAttribute("errMsg");
	String msg=(String)request.getAttribute("msg");%>

<% ConsumerMasterBean consumerBean= 
		(ConsumerMasterBean) session.getAttribute("loggedInConsumer"); %>
<% List<BillHistoryBean> bean=(List<BillHistoryBean>) request.getAttribute("history") ;%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Consumer Login Page</title>
<link rel="stylesheet" href="${css}/login.css">

<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body>

	<h2 style="color: white">Bill History Page</h2>
	<%
  for( BillHistoryBean list : bean) { %><tr>

		<%SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy"); %>
		<td><strong><%= form.format(list.getHistory().getDate()) %></strong></td>
		<td><strong><%= list.getStatus() %></strong></td>
		<td><strong><%= list.getTotalAmount()%></strong></td>
	</tr>
	<%  
         } %>

	<pre>
  <table class="home">
    <tr>
      <td>
                  <a href="./consumerBillDisplay"
					style="color: white; font-size: 25px">Current Bill</a>
      </td>
    </tr>
    <tr>
      <td>
                  <a href="./monthlyConsumption"
					style="color: white; font-size: 25px">Monthly Consumption</a>
      </td>
    </tr>
    <tr>
      <td>
                  <a href="./billHistory"
					style="color: white; font-size: 25px">Bill History</a>
      </td>
    </tr>
    <tr>
      <td>
                  <a href="./payment"
					style="color: white; font-size: 25px">Pay Online</a>
      </td>
    </tr>
  </table>
  </pre>
	<% if(msg!=null && !msg.isEmpty()){ %>
	<h2 style="color: white;"><%=msg %></h2>
	<%} %>

	<% if(errMsg!=null && !errMsg.isEmpty()){ %>
	<h2 style="color: red;"><%=errMsg %></h2>
	<%} %>
</body>
</html>