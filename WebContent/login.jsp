<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp"%>

	<center id="body">
		<h1 style="color: black;">Login</h1>

		<form>
		<center id="login">
			<table>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" value="${param.email}"
						name="email"></td>
				</tr>


				<tr>
					<td><label>Password</label></td>
					<td><input type="password" value="${param.password}"
						name="password"></td>
				</tr>

			</table>

			<tr>

				<td  align="center"><input type="submit"
					name=" submit" value="login" style="background-color: grey;"></td>
			</tr>
			<br>
			<tr>
			
				<td><a href="register.jsp"> New Customer?</a></td>
			</tr>
	</div>

	</form>
	</div>


</body>
</html>