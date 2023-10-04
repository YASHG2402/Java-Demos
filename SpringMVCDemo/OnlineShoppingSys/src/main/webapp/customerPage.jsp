<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Customer DashBoard!!</h2>
	<form action="customerdashboard">
		<button onclick="form.action='addtoCart'">Add Products To Cart</button>
		<button onclick="form.action='showCart'">Display Products in Cart</button>
		<button onclick="form.action='billing'">Display Bill</button>
		<button onclick="form.action='purchased'">All Purchases</button>
		<button onclick="form.action='logout'">Log Out</button>
		<p>ACCOUNT USER ID - ${username}</p>
		<p>ACCOUNT BALANCE - ${balance}</p>
	</form>
</body>
</html>