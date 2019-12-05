<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pets</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="../static/css/style.css">
</head>
<body>
	<h1>Welcome to</h1>
	<hr>
	<h2>Add a Cat</h2>
	<form action="/Pets/cats">
		<input type="text" class="form-control" placeholder="Enter a name" name="name"><br>
		<input type="text" class="form-control" placeholder="Enter a breed" name="breed"><br>
		<input type="number" class="form-control" placeholder="Enter a weight" name="weight"><br>
		<button class="btn btn-primary">Add Cat</button>
	</form>
	<h2>Add a Dog</h2>
	<form action="/Pets/dogs">
		<input type="text" class="form-control" placeholder="Enter a name" name="name"><br>
		<input type="text" class="form-control" placeholder="Enter a breed" name="breed"><br>
		<input type="number" class="form-control" placeholder="Enter a weight" name="weight"><br>
		<button class="btn btn-primary">Add Dog</button>
	</form>
</body>
</html>