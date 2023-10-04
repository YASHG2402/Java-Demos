<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr border="1">
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Discount</th>
	</tr>
	<c:forEach var="product" items="${list}">
		<tr>
			<td>${product.productNo}</td>
			<td>${product.productName }</td>
			<td>${product.productPrice }</td>
			<td>${product.quantity}</td>
			<td>${product.discount }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>