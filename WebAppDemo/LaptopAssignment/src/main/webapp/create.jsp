<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	int a = (int)session.getAttribute("lid");
	String b = (String) session.getAttribute("name");
	int c = (int) session.getAttribute("cost");
	out.println("Entry<br>");
	out.println("Laptop ID: " + a + "Laptop Name: " + b + " Laptop Cost:" + c);
	out.println("Record inserted successfully");

%>
</body>
</html>