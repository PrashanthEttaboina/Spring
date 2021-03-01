<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Login Page</title>
</head>
<body bgcolor='lightskyblue'>
<br><br>
<center><h2>WELCOME TO PATIENT LOGIN PAGE </h2></center>
<br>
<form action="/KimsApplicationSpring/dlogin" method="post" align ="center">

<label>Email id : </label>
<input type="email" name="email" placeholder="Enter email-id : ">
<br><br>
<label>Password : </label>
<input type="password" name="password" placeholder="Enter Password : ">
<br><br>
<input type="Submit" value="Login">
<br><br>
<a href="/KimsApplicationSpring/index">
Home
</a>
</form>

</body>
</html>