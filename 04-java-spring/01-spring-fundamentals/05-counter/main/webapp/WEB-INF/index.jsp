<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <h1 class="nav-brand bg-dark">Counter App</h1>        
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
                    <a class="nav-link" href="/plus2">+2</a>
                </li>
                <li class="bg-dark">
                    <span class="far fa-plus-square bg-dark"></span>
                </li>
                <li class="nav-item active bg-dark">
                    <a class="nav-link" href="/plus5">+5</a>
                </li>
                <li class="bg-dark">
                    <span class="fas fa-undo bg-dark"></span>
                </li>
                <li class="nav-item active bg-dark">
                    <a class="nav-link" href="/reset">Reset</a>
                </li>
                <li class="bg-dark"> 
                    <span class="fas fa-clock bg-dark"></span>
                </li>
                <li class="nav-item active bg-dark">
                    <a class="nav-link" href="/counter">See Count</a>
                </li>
            </ul>
        </div>
    </nav>
    <h1>Index Page</h1>
</body>
</html>