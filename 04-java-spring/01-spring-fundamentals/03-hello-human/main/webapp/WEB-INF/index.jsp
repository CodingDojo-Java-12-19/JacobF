<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello <c:out value="${ name }"></c:out></title>
</head>
<body>
	<h1>Hello <c:out value="${ name }"></c:out>!</h1>
	<h3>Welcome to Spring Boot!</h3>
</body>
</html>