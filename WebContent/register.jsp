
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
		<form action="registerServlet" name="regform" method="post" onsubmit="return registerValidation()">
	
			<table>
				<tr>
					<td><label>UserName</label></td>
					<td><input type="text" value="${param.userName}" name="userName" pattern="[a-zA-Z]{5,15}"></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" value="${param.email}" name="email" pattern="[a-zA-Z0-9]{1,}+@[a-zA-z]{2,7}+.[a-z]{3,6}"></td>
				</tr>
				<tr>
					<td><label>Mobile</label></td>
					<td><input type="tel" value="${param.mobile}" name="mobile" pattern="[0-9]{10}"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" value="${param.password} name="password" pattern="[a-zA-Z0-9]{8}"
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
		<script src="Validation.js"></script>
	</div>
</body>
</html>