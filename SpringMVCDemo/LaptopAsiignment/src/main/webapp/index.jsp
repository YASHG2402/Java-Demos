<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add">
		Enter Laptop Id: <input type="text" name="id">
		<br>
		Enter Laptop Name: <input type="text" name="name">
		<br>
		Enter Laptop Cost: <input type="text" name="cost">
		<br>
		<button type="submit" onclick="form.action='add';">Add</button>
		<button type="submit" onclick="form.action='show';">Show</button>
	</form>
</body>
</html>