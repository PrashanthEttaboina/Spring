<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Register</title>
</head>
<body bgcolor="lightskyblue">
<br><br> <br><br>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<form:form action="/KimsApplicationSpring/add_patient" method="post" modelAttribute="register">
<label>Patientname</label>
<form:input path="patientname"  placeholder="Enter Username" />
<label>Password</label>
<form:password path="password" placeholder="Enter Password" />
<label>Email</label>
<form:input path="email" placeholder="Enter Email"/>
<label>phone</label>
<form:input path="phone" placeholder="Enter phone"/>
<label>age</label>
<form:input path="age" placeholder="Enter age"/>
<label>Gender</label>   
        Male<form:radiobutton path="gender" value="Male"/>  
        Female<form:radiobutton path="gender" value="Female"/>  
        <br><br>  

<input type="submit" value="Register"/>
</form:form>

</body>
</html>