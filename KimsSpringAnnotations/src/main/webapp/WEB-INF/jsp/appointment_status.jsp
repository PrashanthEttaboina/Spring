<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
	<br>
	<br>
	<center>
		<h1>Welcome to Appointment Stauts Page</h1>
		<br>
		<br> <a href="/KimsSpringAnnotations/patient_home">Home</a> | <a
			href="/KimsSpringAnnotations/patient_profile">Profile</a> | <a
			href="/KimsSpringAnnotations/appointment">Appointment</a> | <a
			href="/KimsSpringAnnotations/index">Logout</a>
	</center>
	<br>
	<br>

	<table border="2" align="center" width="600" height="100" cellpadding="20">
		<tr>
			<td>Patient Name</td>
			<td>Phone</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Blood_group</td>
			<td>Specialist</td>
			<td>Date of appointment</td>
			<td>Time of appointment</td>
			<td>Doctor Name</td>
			<td>Status</td>
		</tr>
		<c:forEach var="ab" items="${list}">
			<tr>
				<td>${ab.getPname()}</td>
				<td>${ab.getPhone()}</td>
				<td>${ab.getEmail()}</td>
				<td>${ab.getGender()}</td>
				<td>${ab.getBlood_group()}</td>
				<td>${ab.getSpecialist()}</td>
				<td>${ab.getDate_of_appointment()}</td>
				<td>${ab.getTime_of_appointment()}</td>
				<td>${ab.getDname()}</td>
				<td>${ab.getStatus()}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>