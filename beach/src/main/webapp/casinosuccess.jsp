<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a>
				<ul>
				<li style="display: inline-block;padding: 20px;">
				 <a href="index.jsp">Home Page</a>
				 <li style="display: inline-block;">
				<a href="Casino.jsp">Casino</a>
				</ul>
		</div>
	</nav>
<h1>Casino Entering Success</h1>
<h2>Casino Name:${casinoName}</h2>
<h2>Cruise Name:${cruiseName}</h2>
<h2>Entry Fee:${entryFee}</h2>
<h2>Free Food:${freeFood}</h2>
<h2>Free alcohol:${freeAlcohol}</h2>
</body>
</html>