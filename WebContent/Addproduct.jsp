<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
#body{
padding-top: 7%;
}
</style>
</head>
<body>

<%@include file="modify.jsp"%>
<center id="body">
<form action="addproduct"  method="post" name="addproductform" onsubmit=" return productValidation()">
<h1 style ="color:black">ADD PRODUCT</h1>
	<table>
		<tr>
			<td><label>Product Name</label></td>
			<td><input type="text" value="${param.productName}" name="productName" pattern="[a-zA-Z0-9]{5-20}"></td>
			<td><span style="color: red">${errorMessages.productNameError}</span>
			</td>

		</tr>
		<tr>
			<td><label>Product Price</label></td>
			<td><input type="text" value="${param.productPrice}" name="productPrice" pattern="[0-9]{5-10}"></td>
			<td><span style="color: red">${errorMessages.productPriceError}</span>
			</td>

		</tr>
		<tr>
			<td><label>No of Quantity</label></td>
			<td><input type="text" value="${param.noOfQuantity}" name="noOfQuantity"  pattern="[0-9]{1-5}"></td>
			<td><span style="color: red">${errorMessages.noOfQuantityError}</span>
			</td>

		</tr>
		
		<tr>
			<td><label>Specifications</label></td>
			<td><textarea name="specifications" rows="8" cols="30" ></textarea><td>
		</tr>
		<tr>

					<td style="padding-left:45%" ><input type="submit" name=" submit" value="Add Product"
						style="background-color:infobackground;"></td>
				</tr>
		
		</center>
</body>
</form>

</html>