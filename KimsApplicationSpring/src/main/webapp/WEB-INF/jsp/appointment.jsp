<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>Welcome to Appointment Page</h1>
<br><br>
<a href="/KimsApplicationSpring/patient_home">Home</a> |
<a href="/KimsApplicationSpring/patient_profile">Profile</a> |
<a href="/KimsApplicationSpring/appointment_status">Appointment status</a> |
<a href="/KimsApplicationSpring/index">Logout</a>
</center>
<br><br>
<form:form action="/KimsApplicationSpring/apply_appointment" method="post" modelAttribute="appointment"  align="center">

<label>Patient Name : </label>
<form:input type="text" path="pname" placeholder="Enter patient name "/><br><br>
<label>Phone : </label>
<form:input type="number" path="phone" placeholder="Enter phone number"/><br><br>
<label>Email : </label>
<form:input type="email"  path="email" placeholder="Enter email"/><br><br>
<label>Gender : </label>
<form:radiobutton path="gender" value="male" />Male
<form:radiobutton path="gender" value="female" />Female<br><br>
<label>Blood Group : </label>
<form:select path="blood_group">
<form:option value="A+">A+</form:option>
<form:option value="A-">A-</form:option>
<form:option value="B+">B+</form:option>
<form:option value="B-">B-</form:option>
<form:option value="AB+">AB+</form:option>
<form:option value="AB-">AB-</form:option>
<form:option value="O+">O+</form:option>
<form:option value="O-">O-</form:option>
</form:select><br><br>
<label>Specialist : </label>
<form:select path="specialist">
<form:option value="Dentist">Dentist</form:option>
<form:option value="Cardio">Cardio</form:option>
<form:option value="ENT">ENT</form:option>
</form:select><br><br>
<label>Date Of Appointment : </label>
<form:input type="date" path="date_of_appointment" placeholder="select date for appointment"/><br><br>
<label>Time of Appointment : </label>
<form:input type="time" path="time_of_appointment" placeholder="select time for appointment"/><br><br>

<input type="submit" value="apply"> 
</form:form> 
${appointment.getPatient().getId() }
</body>
</html>