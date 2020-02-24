
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
#submit{
padding-left: 13%;
padding-top: 3%;
}
#body{
padding-left: 40%;
padding-top: 5%;
}
</style>
</head>
<body>

<%@include file="header.jsp"%>
		
	<div id="body">
		<h1 style="color: black;">Registration</h1>
		<form action="/RegisterServlet" method="post">
	
			<table>
				<tr>
					<td><label>Full name</label></td>
					<td><input type="text" value="${param.fullName}" name="fullName"></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" value="${param.email}" name="email"></td>
				</tr>
				<tr>
					<td><label>Mobile</label></td>
					<td><input type="tel" value="${param.mobile}" name="mobile"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" value="${param.password}"
						name="password"></td>
				</tr>
				
			</table>
			<div id="submit">
				<tr>

					<td><input type="submit" name=" submit" value="register"
					 style=" background-color:grey;"></td>
				</tr>
				</div>

		</form>
	</div>
</body>
</html>