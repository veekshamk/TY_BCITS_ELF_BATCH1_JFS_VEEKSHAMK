<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./login" method="post">
		<table style="width: 300px; height: 100px; font-size: 18px;">
			<tbody>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" id="username" name="username" placeholder="Enter the User Name" required></td>
			</tbody>
			<tbody>
				<td>Password</td>
				<td>:</td>
				<td><input type="text" id="password" name="password" placeholder="Enter the Password" required></td>
			</tbody>
			<tbody>
				<td></td>
				<td></td>
				<td><button type="submit">Login</button></td>
			</tbody>
		</table>
	</form>

</body>
</html>