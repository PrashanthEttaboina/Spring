<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Profile</title>
</head>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO PATIENT HOMEPAGE</h1>
<br><br>
<a href="/KimsApplicationSpring/patient_home">Home</a> |
<a href="/KimsApplicationSpring/patient_profile">Profile</a> |
<a href="/KimsApplicationSpring/index">Logout</a> 
<br><br><br>
</center>

<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Patient Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Age</td><td>Gender</td></tr>
<tr>
<td>${pprofile.getId()}</td>
<td>${pprofile.getPatientname()}</td>
<td>${pprofile.getEmail()}</td>
<td>${pprofile.getPhone()}</td>
<td>${pprofile.getAge()}</td>
<td>${pprofile.getGender()}</td>
</tr>
</table>
<br><br>
<center><a href="/KimsApplicationSpring/update_patient_profile">update</a></center>
</body>
</html>