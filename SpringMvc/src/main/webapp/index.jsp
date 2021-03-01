<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<body bgcolor="lightskyblue">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<center>
<form action="register" >
<input type="text" name="username" placeholder="Enter username">
<input type="password" name="password" placeholder="Enter Password">
<input type="email" name="email" placeholder="Enter Email">
<input type="number" name="phone" placeholder="Enter phone number">
<input type="submit" value="Register">
</form>
</center>
</body>
</html>
