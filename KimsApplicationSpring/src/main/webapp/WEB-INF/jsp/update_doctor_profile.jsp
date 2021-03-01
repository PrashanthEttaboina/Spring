<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Update Page</h1>
		<br> <br> <a href="/KimsApplicationSpring/doctor_home">Home</a>
		| <a href="/KimsApplicationSpring/doctor_profile">Profile</a> | <a
			href="/KimsApplicationSpring/index">Logout</a>
	</center>
	<br>
	<br>
	<form:form action="/KimsApplicationSpring/doctor_update" method="post"
		modelAttribute="doctor" align="center">
		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="password" />
		name:<form:input type="text" path="doctorname" />
		<br>
		<br>
		email:<form:input type="email" path="email" />
		<br>
		<br>
		phone:<form:input type="text" path="phone" />
		<br>
		<br>
		Gender:<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female<br>
		<br>
		<br>
Specialization:<form:select path="specialisation">
			<form:option value="Dentist">Dentist</form:option>
			<form:option value="Cardio">Cardio</form:option>
			<form:option value="ENT">ENT</form:option>
		</form:select>
		<br>
		<br>
		Experience:<form:input type="number" path="experience" />
		<br>
		<br>
		Address :<form:input type="text" path="address"></form:input>
		<br>
		<br>
		<input type="submit" value="update">
	</form:form>
</body>
</html>