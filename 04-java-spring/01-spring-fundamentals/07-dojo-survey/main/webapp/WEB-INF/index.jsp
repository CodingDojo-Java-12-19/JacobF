<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey</title>
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
		<h1>Complete the Coding Dojo Survey</h1>
		<form action="/submit" method="POST" class="form-group">
			<h3>Your Name</h3>
			<input type="text" name="name" class="form-control" placeholder="Enter your name" required>
			<br>
			<h3>Your Location</h3>
			<select name="location" class="form-control" required>
				<option value="Seattle">Seattle</option>
				<option value="San Jose" selected>San Jose</option>
				<option value="Los Angeles">Los Angeles</option>
				<option value="Online">Online</option>
			</select>
			<br>
			<h3>Your Favorite Language</h3>
			<select name="language" class="form-control" required>
				<option value="Python">Python</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Java" selected>Java</option>
			</select>
			<br>
			<h3>Comment (optional)</h3>
			<textarea rows="4" cols="50" name="comment" class="form-control" placeholder="Enter a comment (optional)"></textarea>
			<br>
			<input type="submit" value="Submit Form" class="btn btn-primary">
		</form>
	</div>
</body>
</html>