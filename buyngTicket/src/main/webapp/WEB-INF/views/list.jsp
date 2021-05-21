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
		<td>목적지</td>
		<td>권수</td>
	</tr>
	<c:forEach items="${list }" var="ticket">
	<tr>
		<td>${ticket.name }</td><td>${ticket.num }</td>
	</tr>
	</c:forEach>

</table>

<c:url value="form" var="url"></c:url>
<a href="${url }">입력하기</a>
</body>
</html>