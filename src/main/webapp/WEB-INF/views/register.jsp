<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<form:form method="POST" commandname="register" action="${pageContext.request.contextPath}/user/register.html">  
		Name 
		<form:input path="txtFirstName" placeholder="First" />
	    <form:input path="txtLastName" placeholder="Last" />
		Choose your username 
		<form:input path="txtUserName"/>
		Create a password
		<form:password path="txtPassword"/>
		Confirm password 
		<form:password path="txtPasswordConfirm"/>
		Birthday
		<form:input path="txtBirthday" placeholder="dd/mm/yyyy"/>
		Gender
		<form:select path="selGender" >
	        <form:option value="male">Male</form:option>
	        <form:option value="female">Female</form:option>
		</form:select>
       	<input type="submit" name="submit" value = "Submit" />
	</form:form>  
</body>
</html>