<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add A Product - (Store App)</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <h1 class="nav-brand bg-dark">Store App</h1>        
        <div class="collapse navbar-collapse bg-dark" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto bg-dark">
                <li class="bg-dark"> 
                    <span class="fas fa-home bg-dark"></span>
                </li>
                <li class="nav-item active bg-dark">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <li class="bg-dark">
                    <span class="far fa-plus-square bg-dark"></span>
                </li>
                <li class="nav-item active bg-dark">
                    <a class="nav-link" href="/products/new">Add Product</a>
                </li>
                <li class="bg-dark">
                    <span class="far fa-plus-square bg-dark"></span>
                </li>
                <li class="nav-item active bg-dark">
                    <a class="nav-link" href="/categories/new">Add Category</a>
                </li>
            </ul>
        </div>
    </nav>
	<div class="container-fluid">
		<h2>Add Product</h2>
		<form:form action="/products" method="POST" modelAttribute="product">
			<div class="form-group">
		        <form:label path="name"><h3>Name</h3></form:label>
		        <form:errors path="name"/>
		        <form:input class="form-control" path="name" />
		    </div>
		    <div class="form-group">
		        <form:label path="description"><h3>Description</h3></form:label>
		        <form:errors path="description"/>
		        <form:input class="form-control" path="description" />
		    </div>
		    <div class="form-group">
		        <form:label path="price"><h3>Price</h3></form:label>
		        <form:errors path="price"/>
		        <form:input class="form-control" path="price" />
		    </div>
		    <button class="btn btn-primary">Add</button>
		</form:form>
	</div>
</body>
</html>