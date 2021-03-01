<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>Welcome to Doctor Register Page</h1></center>
<br><br>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="/KimsSpringAnnotations/add_doctor" method="post" modelAttribute="dregister" align="center">
<label>Name:</label>
<form:input type="text" path="doctorname" placeholder="Enter name" /><br><br>

<label>Password:<form:password path="password" placeholder="Enter password" /><br><br>
<label>Email :</label>
<form:input type="email" path="email" placeholder="Enter email" /><br><br>
<label>Phone :</label>
<form:input type="text" path="phone" placeholder="Enter Phone number"/><br><br>
<label>Gender :</label>
<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female<br><br>
<label>Specialisation</label>
<form:select path="specialisation">
<form:option value="Dentist">Dentist</form:option>
<form:option value="Cardio">Cardio</form:option>
<form:option value="ENT">ENT</form:option>
</form:select><br><br>
<label>Experience :</label>
<form:input type="number" path="experience" placeholder="Enter experience" /><br><br>
<label>Address :</label>
<form:input type="text" path="address"></form:input><br><br>
<input type="submit" value="register">
</form:form>
</html>