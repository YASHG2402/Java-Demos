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
	<h3>
	Products List	
	</h3>
	<form action="back">
		<input type="submit" value="Back"/>
	</form>
    <table border="1">
        <tr>
            <th>Product ID</th>
            <th>Name</th>
            <th>Cost</th>
            <th>Available Quantity</th>
            <th>Discount</th>
        </tr>
        <c:forEach var="product" items="${list}">
            <tr>
                <td>${product.productNo}</td>
                <td>${product.productName}</td>
                <td>${product.productPrice}</td>
                <td>${product.quantity}</td>
                <td>${product.discount}</td>
				<td>
	                <form action="addItems">
        				<input type="hidden" name="pid" value="${product.productNo}"/>
        				<input type="hidden" name="name" value="${product.productName}"/>
        				<input type="hidden" name="cost" value="${product.productPrice}"/>
        				<input type="hidden" name="discount" value="${product.discount}"/>
        				<input type="submit" value="Add to Cart" />       	
    	            </form>
				</td>
            </tr>
        </c:forEach>
    </table>
    <form action="showCart">
		<input type="submit" value="Check your cart"/>
	</form>
</body>
</html>