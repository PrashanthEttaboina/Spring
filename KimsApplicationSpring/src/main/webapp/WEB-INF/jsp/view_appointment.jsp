<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
	<br>
	<br>
	<center>
		<h1>Welcome to Appointment Details Page</h1>
		<br> <br> <a href="/KimsApplicationSpring/doctor_home">Home</a>
		| <a href="/KimsApplicationSpring/doctor_profile">Profile</a> | <a
			href="/KimsApplicationSpring/view_appointment">Appointment
			Details</a> | <a href="/KimsApplicationSpring/index">Logout</a>
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
			<td>Action</td>
		</tr>
		<c:forEach var="vab" items="${vlist}">
			<tr>
				<td>${vab.getPname()}</td>
				<td>${vab.getPhone()}</td>
				<td>${vab.getEmail()}</td>
				<td>${vab.getGender()}</td>
				<td>${vab.getBlood_group()}</td>
				<td>${vab.getSpecialist()}</td>
				<td>${vab.getDate_of_appointment()}</td>
				<td>${vab.getTime_of_appointment()}</td>
				<td>${vab.getDname()}</td>
				<td>${vab.getStatus()}</td>
				<c:if test="${vab.getStatus() == 'Accepted'}">
					<td>Accepted</td>
				</c:if>
				<c:if test="${vab.getStatus() != 'Accepted'}">
					<td><a href="/KimsApplicationSpring/accept/${vab.getId()}">Accept</a></td>
				</c:if>
			</tr>
		</c:forEach>

	</table>
</body>
</html>