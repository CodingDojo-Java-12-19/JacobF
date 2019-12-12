<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>All Dojos</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
	<nav>
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="/dojos/new">Create New Dojo</a></li>
			<li><a href="/ninjas/new">Add Ninja</a></li>
			<li><a href="/ninjas">All Ninjas</a></li>
		</ul>
	</nav>
	<div class="container-fluid">
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th># of students</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ dojos }" var="dojo">
					<tr>
						<td><a href="/dojos/${ dojo.id }">${ dojo.name }</a></td>
						<td>${ dojo.ninjas.size() }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>