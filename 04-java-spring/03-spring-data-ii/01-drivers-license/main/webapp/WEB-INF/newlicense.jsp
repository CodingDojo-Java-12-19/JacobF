<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Register A License</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<div class="container-fluid">
		<h2>Register A License</h2>
		<form:form action="/licenses" method="POST" modelAttribute="license">
			<div class="form-group">
		        <form:label path="person"><h3>License Recipient</h3></form:label>
		        <form:errors path="person"/>
		        <form:select class="form-control" path="person">
		        	<c:forEach var="person" items="${ persons }">
		        		<option value="${ person.id }">${ person.firstName } ${ person.lastName }</option>
		        	</c:forEach>
		        </form:select>
		    </div>
		    <div class="form-group">
		        <form:label path="state"><h3>State</h3></form:label>
		        <form:errors path="state"/>
		        <form:input class="form-control" path="state" />
		    </div>
		    <div class="form-group">
		        <form:label path="expirationDate"><h3>Expiration Date</h3></form:label>
		        <form:errors path="expirationDate"/>
		        <form:input type="date" class="form-control" path="expirationDate" />
		    </div>
		    <button class="btn btn-primary">Register License</button>
		</form:form>
	</div>
</body>
</html>