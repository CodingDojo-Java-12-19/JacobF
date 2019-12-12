<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add Ninja</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<nav>
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="/dojos/new">Create New Dojo</a></li>
			<li><a href="/ninjas">All Ninjas</a></li>
			<li><a href="/dojos">All Dojos</a></li>
		</ul>
	</nav>
	<div class="container-fluid">
		<form:form action="/ninjas" method="POST" modelAttribute="ninja">
			<div class="form-group">
		        <form:label path="firstName"><h3>First Name</h3></form:label>
		        <form:errors path="firstName"/>
		        <form:input class="form-control" path="firstName" />
		    </div>
		    <div class="form-group">
		        <form:label path="lastName"><h3>Last Name</h3></form:label>
		        <form:errors path="lastName"/>
		        <form:input class="form-control" path="lastName" />
		    </div>
		    <div class="form-group">
		        <form:label path="age"><h3>Age</h3></form:label>
		        <form:errors path="age"/>
		        <form:input class="form-control" path="age" />
		    </div>
			<div class="form-group">
		        <form:label path="dojo"><h3>Dojo</h3></form:label>
		        <form:errors path="dojo"/>
		        <form:select class="form-control" path="dojo">
		        	<c:forEach var="dojo" items="${ dojos }">
		        		<option value="${ dojo.id }">${ dojo.name}</option>
		        	</c:forEach>
		        </form:select>
		    </div>
		    <button class="btn btn-primary">Add Ninja</button>
		</form:form>
	</div>
</body>
</html>