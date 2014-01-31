<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Register</title>
</head>
<body>
	<form id="frmUpdate" name="frmUpdate" method="POST" commandname="update" action="${pageContext.request.contextPath}/user/edit/${user.id}">
		<div>
			<label id="lblUserName">User name:</label>
			<input type="text" id="txtUserName" value="<c:out value="${user.name}" />">
		</div>
		<div>
			<label id="lblPassword">Password:</label>
			<input type="text" id="txtPassword" value="<c:out value="${user.password}" />">
		</div>
		<div>
			<label id="lblName">First name:</label>
			<input type="text" id="txtName" value="<c:out value="${user.first_name}" />">
		</div>
		<div>
			<label id="lblLastName">Last name:</label>
			<input type="text" id="txtLastName" value="<c:out value="${user.last_name}" />">
		</div>
		<div>
			<label id="lblGender">Gender:</label>
			<input type="text" id="txtGender"value="<c:out value="${user.gender}" />">
		</div>
		<div>
			<label id="lblBirthday">Birthday:</label>
			<input type="text" id="txtBirthday" value="<c:out value="${user.birthday}" />">
		</div>
		<div>
			<label id="lblSignUpDate">Sign up date:</label>
			<input type="text" id="txtSignUpDate" value="<c:out value="${user.insert_date}" />">
		</div>
	</form>
</body>
</html>