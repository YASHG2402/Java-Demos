<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<label>Enter Product Id: </label>
<input type="text" name="id">
<br>
<label>Enter Product Name: </label>
<input type="text" name="name">
<br>
<label>Enter Product Price: </label>
<input type="text" name="price">
<br>
<label>Enter Quantity of Product: </label>
<input type="text" name="quantity">
<br>
<label>Enter the Discount: </label>
<input type="text" name="discount">
<br>
<input type="submit" value="Add Product" onclick="form.action='add';">
<input type="submit" value="Show All Products" onclick="form.action='showproducts';">
<input type="submit" value="Add Customer" onclick="form.action='addCus';">
<input type="submit" value="Delete Customer" onclick="form.action='removecustomer';">
</form>
</body>
</html>