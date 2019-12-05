<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.codingdojo.pets.models.Animal, com.codingdojo.pets.models.Cat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%
		Animal animal = (Animal)request.getAttribute("animal");
		String type = (animal instanceof Cat) ? "Cat" : "Dog";
	%>
	
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New <%= type %></title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
</head>
<body>
	<h2>You created a <%= animal.getBreed() %></h2>
	<p>The <%= animal.getBreed() %> says "<c:out value="${ animal.sayGreeting() }" />"</p>
</body>
</html>