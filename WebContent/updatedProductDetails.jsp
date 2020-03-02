<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateDetails" method="post">
	<table border="1" width="100%" :collapse; bordercolor"black">
				<tr>
				<th>productId</th>
					<th>productName</th>
					<th>productPrice</th>
					<th>noOfQuantity</th>
					<th>specifications</th>
					<th>ProductImage</th>
					<th>update</th>
				
				</tr>
				
					<tr>
					  <td><input type="text" value="${ProductDetails.productId}"></td>
						<td><input type="text" value="${ProductDetails.productName}"></td>
						<td><input type="text" value="${ProductDetails.productPrice}"></td>
					    <td><input type="text" value="${ProductDetails.noOfQuantity}"></td>
						<td><input type="text" value="${ProductDetails.specifications}"></td>
						<td><img width="250" height="250"  src="${prodimages}/${Products.productId}.jpg"/></td>
						<td><input type="submit" value="update"></td>
						
					</tr>
		
			</table>
			</form>

</body>
</html>