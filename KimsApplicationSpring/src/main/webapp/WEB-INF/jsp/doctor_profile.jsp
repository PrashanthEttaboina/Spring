<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Profile Page</h1>
		<br> <br> <a href="/KimsApplicationSpring/doctor_home">Home</a>| 
		<a href="/KimsApplicationSpring/doctor_profile">Profile</a> |
			 <a href="/KimsApplicationSpring/index">Logout</a>
	</center>
	<br><br><br>
	<table border="2" align="center" width="600" height="100" cellpadding="20">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Specialisation</td>
			<td>Experience</td>
			<td>Address</td>
			
		</tr>
		
		<tr>
			<td>${doctor.getId()}</td>
			<td>${doctor.getDoctorname()}</td>
			<td>${doctor.getEmail()}</td>
			<td>${doctor.getPhone()}</td>
			<td>${doctor.getGender()}</td>
			<td>${doctor.getSpecialisation()}</td>
			<td>${doctor.getExperience()}</td>
			<td>${doctor.getAddress()}</td>
			
			</tr>
	</table>
			<br><br><br>
		<center>	<a href="/KimsApplicationSpring/update_doctor_profile">update</a></center>
		</body>
</html>