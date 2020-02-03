<%@page import="com.bcits.discom.beans.CurrentBillBean"%>
<%@page import="com.bcits.discom.beans.ConsumerMasterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="resources/css" />
<spring:url var="js" value="resources/js" />
<spring:url var="images" value="resources/images" />

<% ConsumerMasterBean consumerBean= 
		(ConsumerMasterBean) session.getAttribute("loggedInCons"); 
		CurrentBillBean billBean=(CurrentBillBean) session.getAttribute("generatedBill");%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Consumer Login Page</title>
<link rel="stylesheet" href="${css}/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  >
</head>

<body>

<table class="tables">
	 <thead>
          <tr>
            <th scope="row">rr Number</th>
            <th scope="row"><%= billBean.getRrNumber() %></th>
          </tr>
        </thead>
        <thead>
            <tr>
                <th scope="row">Initial Reading</th>
              <th scope="row"><%= billBean.getInitialReading() %></th>
            </tr>
          </thead>
          <thead>
            <tr>
                <th scope="row">Final Reading</th>
              <th scope="row"><%= billBean.getFinalReading() %></th>
            </tr>
          </thead>
          <thead>
            <tr>
                <th scope="row">Total amount</th>
              <th scope="row"><%= billBean.getTotalAmount() %></th>
            </tr>
          </thead>
          <thead>
            <tr>
                <th scope="row">Units Consumed</th>
              <th scope="row"><%= billBean.getUnitsConsumed() %></th>
            </tr>
          </thead>
          <thead>
            <tr>
                <th scope="row">Due Date</th>
              <th scope="row"><%= billBean.getDueDate() %></th>
            </tr>
          </thead>
          <thead>
            <tr>
                <th scope="row">Month</th>
              <th scope="row"><%=billBean.getMonth() %></th>
            </tr>
          </thead>
          <thead>
            <tr>
                <th scope="row">Date</th>
              <th scope="row"><%=billBean.getDate() %></th>
            </tr>
          </thead>
        
      </table>

</body>
</html>