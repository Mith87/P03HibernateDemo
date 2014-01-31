<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form:form method="POST" commandname="login" action="${pageContext.request.contextPath}/user/login.html">  
		Username
		<form:input path="txtUserName"/>
		Password
		<form:password path="txtPassword"/>
       	<input type="submit" name="submit" value = "Submit" />
	</form:form>  
</body>
</html>