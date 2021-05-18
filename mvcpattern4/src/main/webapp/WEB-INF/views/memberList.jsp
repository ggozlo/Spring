<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
	<tr>
		<th>이름</th>
		<th>전화번호</th>
		<th>이메일</th>
	</tr>
	<c:forEach var="member" items="${memberList }">
	<tr>
		<td>${member.name }</td>
		<td>${member.tel }</td>
		<td>${member.email }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>