<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send details of Fav Person</title>
</head>
<body>
<form action="touch" method="post">
<pre>
FirstName<input type="text" name="fname"/>
LastName<input type="text" name="lname"/>
Gender <input type="radio" id="Male" name="gender" value="Male">Male
	<input type="radio" id="Female" name="gender" value="Female">Female
	<input type="radio" id="other" name="gender" value="other">Other
Reason<textarea rows="3" cols="5"  name="reason"></textarea>
Address<textarea rows="5" cols="5"  name="address"></textarea>
<input type="submit" name="send"/>
</pre>
</form>
</body>
</html>