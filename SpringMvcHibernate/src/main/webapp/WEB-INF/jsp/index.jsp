<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

<br><br><br><br>
Employee Registration Page
<br><br><br><br>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<form:form action="/SpringMvcHibernate/register" method="post" modelAttribute="register">

<form:input path="username" placeholder="Enter Username" />
<form:password path="password" placeholder="Enter Password" />
<form:input path="email" placeholder="Enter Email"/>
<form:input path="phone" placeholder="Enter phone"/>
<form:input path="designation" placeholder="Enter designation"/>
<input type="submit" value="Register"/>
</form:form>
</body>
</html>
