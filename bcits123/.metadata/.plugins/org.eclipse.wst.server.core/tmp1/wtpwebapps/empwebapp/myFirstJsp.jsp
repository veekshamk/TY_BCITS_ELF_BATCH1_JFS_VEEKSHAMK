<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%! private int a=10;
	
	public void setA(int a){
		this.a=a;
	}
	public int getA(){
		return a;
	}
	
	public String name="Seema";
	
	public String getName(){
		return name;
	}
	public String getName(String name){
		return name;
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	a=<%=a %> <br>
	a=<%=getA() %> <br>
	<% setA(100); %>
	a=<%=getA() %> <br><br>
	
	name=<%=name %> <br>
	name=<%=getName() %> <br>
	name=<%=getName("Dinga") %> <br> <br>
	
	<%for (int i=0; i<5; i++) { %>
		<%=getName() %> <br>
		<%} %>
		
		<%-- <jsp:forward page="./date.html"></jsp:forward> --%> <!-- static resourse -->
		<%-- <jsp:forward page="./currentDate"></jsp:forward> --%> <!-- dynamic resource -->
		
		<%-- <jsp:forward page="./searchEmp?empId=234"></jsp:forward> --%> <!-- dynamic resource with param -->
		
<%-- 	<jsp:forward page="./searchEmp">
		<jsp:param name="empId" value="741"/>
	</jsp:forward>	
		 --%>

<%-- <jsp:include page="./date.html"></jsp:include> --%> <!-- static resourse -->
<%-- <jsp:include page="/currentDate"></jsp:include> --%> <!-- dynamic resource -->

<%-- <jsp:include page="./searchEmp?empId=234"></jsp:include> --%>

<%-- <jsp:include page="/searchEmp">
		<jsp:param name="empId" value="741"/>
	</jsp:include> --%>
	
	 <%@ include file="date.html" %>   <!-- filename is possible -->
	
	<%-- <%@ include file="/currentDate" %> --%> <!-- dynamic resource not possible -->
	
	
	
	

</body>
</html>