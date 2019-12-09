<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Dojo Survey Results</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css" />
<style>
.container-fluid{
margin-top: 50px;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<h1>Submitted Form Data</h1>
		<h3>Your name: <c:out value="${ name }"></c:out></h3>
		<h3>Your location: <c:out value="${ location }"></c:out></h3>
		<h3>Your language: <c:out value="${ language }"></c:out></h3>
		<h3>Your comment: <c:out value="${ comment }"></c:out></h3>
	</div>
</body>
</html>