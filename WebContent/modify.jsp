<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="Header.css">
<style>
*{
padding:0;
margin:0;
}
#banner{
padding-bottom: 2%;
}
#menu{
padding-right: 15%;
}
</style>
</head>
<body background="shop.jpg">
<div id="banner">
		<div id="head">
			<h1>ECOMMERCE</h1>
		</div>
		<div id="menu">
		<a href="Addproduct.jsp"><button Style="color: black">Add Product</button></a>
			<a href="Editproduct.jsp"><button Style="color: black">Edit product</button></a> <a
				href="Deleteproduct.jsp"><button Style="color: black">Delete product</button></a>
				<a href="Logout"><button Style="color: black">LogOut</button></a>
				
		</div>
	</div>
</body>
</html>