<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Profile Update</title>
</head>
<body bgcolor="lightskyblue">
<center><h2>Patient Profile Update Page</h2> 

<br> <br> <a href="/KimsSpringAnnotations/patient_home">Home</a> | <a
			href="/KimsSpringAnnotations/patient_profile">Profile</a> | 
			<a href="/KimsSpringAnnotations/index">Logout</a>
	</center>
	<br>
	<br>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<form:form action="/KimsSpringAnnotations/update_patient" method="post" modelAttribute="pprofile" align="center">
<form:input type="hidden" path="id" />
<label>Patient Name :</label>
<form:input type="text"  path="patientname" placeholder="Enter name"/><br><br>
<form:input type="hidden"  path="password"/>
<label>Email :</label>
<form:input type="email" path="email" placeholder="Enter email"/><br><br>
<label>Phone :</label>
<form:input type="text" path="phone" placeholder="Enter Phone number"/><br><br>
<label>Age :</label>
<form:input path="age" placeholder="Enter age"/><br><br>
<label>Gender :</label>   
        Male<form:radiobutton path="gender" value="Male"/>  
        Female<form:radiobutton path="gender" value="Female"/>  
        <br><br>  

<input type="submit" value="update">
</form:form>
</body>
</html>