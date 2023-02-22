<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to BigBasket data page</h1>
	
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
	
	<form action="bigBasket" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">email</label> <input
				type="email" class="form-control" name="email" id="formFile"
				placeholder="Enter email" />
		</div>
		
	
		<div class="mb-3">
			<label for="formFile" class="form-label">password</label> <input
				type="password" class="form-control" name="password" id="formFile"
				placeholder="Enter password" />
		</div>
		
		
		Select Area <select class="form-select"
			aria-label="Default select example" name="area">
			<option selected value="">Select area</option>
			<c:forEach items="${area}" var="a">
			<option value="${a}">${a}</option>
			</c:forEach>
			</select>
		Select Item <select class="form-select"
			aria-label="Default select example" name="item">
			<option selected value="">Select Item</option>
			<c:forEach items="${item}" var="i">
			<option value="${i}">${i}</option>
			</c:forEach>
			</select>
			
			<div class="mb-3">
			<label for="formFile" class="form-label"> quantity</label> <input
				type="number" class="form-control" name="quantity" id="formFile"
				placeholder="Enter quantity" />
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label"> noOfItems</label> <input
				type="number" class="form-control" name="noOfItems" id="formFile"
				placeholder="Enter noOfItems" />
		</div>
			
			<div class="mb-3">
			<label for="formFile" class="form-label">Total Price</label> <input
				type="number" class="form-control" name="price" id="formFile"
				placeholder="Enter price" />
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label"> Mobile number</label> <input
				type="number" class="form-control" name="mbl" id="formFile"
				placeholder="Enter number" />
		</div>
		
		<div class="mb-3">
			<label for="formFile" class="form-label"> ratings</label> <input
				type="number" class="form-control" name="ratings" id="formFile"
				placeholder="Enter rating" />
		</div>
			
			<div class="mb-3">
			COD :yes<input name="COD" type="radio" value="true"/> No<input name="COD" type="radio" value="false"/>
		</div>
			
			<input type="submit" value="Save" class="btn btn-primary"/>
		</form>
</body>
</html>