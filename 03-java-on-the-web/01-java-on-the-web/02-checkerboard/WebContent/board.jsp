<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Checkerboard</title>
    <link rel="stylesheet" href="./style.css">
</head>
<body>
    <!-- this is a declaration tag for methods -->
    <%!
	public String getColor(int x, int y) {
		if(x%2 == 0){
            return y%2 == 0 ? "black" : "purple";
        }
		return y%2 == 0 ? "purple" : "black";
	}
    %>
    <!-- this is a tag for any java code -->
    <% 
	String w = request.getParameter("width") != null ? request.getParameter("width") : "4";
	String h = request.getParameter("height") != null ? request.getParameter("height") : "4";
	int width = Integer.parseInt(w);
	int height = Integer.parseInt(h);
    %>
    <div class="board-container">
		<h1>Checkerboard: <%= width %> x <%= height %></h1>
		<% for(int row = 0; row < height; row++){ %>
			<div class="row">
				<% for(int col = 0; col < width; col++){ %>
					<div class="tile <%= getColor(row, col) %>"></div>
				<% } %>
			</div>
		<% } %>
	</div>
</body>
</html>