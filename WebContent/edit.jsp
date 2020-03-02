<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="prodimages" value="${pageContext.request.contextPath}/images"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Header.css">
<style>
*{
padding:0;
margin:0;
}
#table{
padding-top: 5%;
}
#banner{
padding-bottom: 2%;
}
#menu{
padding-right: 15%;
}
</style>
</head>
<body >
<div id="banner">
		<div id="head">
			<h1>ECOMMERCE</h1>
		</div>
		<div id="menu">
		<a href="Addproduct.jsp"><button Style="color: red">Add Product</button></a>
				  <a href="Deleteproduct.jsp"><button Style="color: red">Delete product</button></a>
				<a href="LogoutServlet"><button Style="color: red">LogOut</button></a>
				
		</div>
	</div> 
	     
	<div id="table">
		<c:if test="${listOfProducts.size()>0}">
		    <h1 style="color: red; padding-left: 10%;">List Of Products</h1>
			<table border="1" width="100%" :collapse; bordercolor"black">
				<tr>
				<th>productId</th>
					<th>productName</th>
					<th>productPrice</th>
					<th>noOfQuantity</th>
					<th>specifications</th>
					<th>ProductImage</th>
					<th>edit</th>
					<th>delete</th>
				
				</tr>
				<c:forEach var="Products" items="${listOfProducts}">
					<tr>
					  <td>${Products.productId}</td>
						<td>${Products.productName}</td>
						<td>${Products.productPrice}</td>
						<td>${Products.noOfQuantity}</td>
						<td>${Products.specifications}</td>
						<td><img width="250" height="250"  src="${prodimages}/${Products.productId}.jpg"/></td>
						<td><a href="modifyDetails?id=${Products.productId}"><button style="color: red;">Edit</button></a>
						<td><a href="delete?id=${Products.productId}"><button style="color: red;">Delete</button></a>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
	
	
	                        
</body>
</html>