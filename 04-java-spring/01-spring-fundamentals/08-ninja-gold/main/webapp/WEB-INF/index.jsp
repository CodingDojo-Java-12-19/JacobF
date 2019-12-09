<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ninja Gold</title>
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
	<div id="container-fluid">
	
	    <header>
	        <h2>Your Gold:</h2>
	        <div class="gold-box"><c:out value="${ goldCount }"></c:out></div>
	    </header>
	    <div id="buildings">
	        <form action="/gold/farm" method="POST">
		        <div class="farm">
		            <h1>Farm</h1>
		            <p>(earns 10-20 gold)</p>
		            <input type="submit" name="farm" value="Find Gold!" class="btn btn-secondary">
		        </div>
	        </form>
	        <form action="/gold/cave" method="POST">      
		        <div class="cave">
		            <h1>Cave</h1>
		            <p>(earns 5-10 gold)</p>
		            <input type="submit" name="cave" value="Find Gold!" class="btn btn-secondary">
		        </div>
	        </form>
	        <form action="/gold/house" method="POST">            
		        <div class="house">
		            <h1>House</h1>
		            <p>(earns 2-5 gold)</p>
		            <input type="submit" name="house" value="Find Gold!" class="btn btn-secondary">
		        </div>
	        </form>
	        <form action="/gold/casino" method="POST">                      
		        <div class="casino">
		            <h1>Casino</h1>
		            <p>(earn or lose 0-50 gold)</p>
		            <input type="submit" name="casino" value="Find Gold!" class="btn btn-secondary">
		        </div>
	        </form>
	    </div>
	    <p>Game Console:</p>
        <div id="text-container">
        	<c:forEach items="${ messages }" var="message">
        		<span class="message"><c:out value="${ message }"></c:out></span><br>
        	</c:forEach>
        </div>
        <form action="/reset">           
        	<input type="submit" value="Reset Game" class="btn btn-primary">
        </form>
	</div>
</body>
</html>