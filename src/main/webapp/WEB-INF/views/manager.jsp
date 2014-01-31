<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manager</title>
</head>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th>User name</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Gender</th>
					<th>Birthday</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
	                <tr>
	                    <td><c:out value="${user.name}" /></td>
	                    <td><c:out value="${user.first_name}" /></td>
	                    <td><c:out value="${user.last_name}" /></td>
	                    <td><c:out value="${user.gender}" /></td>
	                    <td><fmt:formatDate pattern="dd-MMM-yyyy" value="${user.birthday}"/></td>
	                    <td><a href="${pageContext.request.contextPath}/user/edit/${user.id}">Read</a></td>
	                </tr>
            	</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>