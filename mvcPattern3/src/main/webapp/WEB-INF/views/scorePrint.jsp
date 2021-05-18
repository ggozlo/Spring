<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
	</tr>

<c:forEach items="${scoreList }" var="score">
	<tr>
		<td>${score.name }</td>
		<td>${score.kor }</td>
		<td>${score.eng }</td>
		<td>${score.mat }</td>
	</tr>
</c:forEach>


</table>
</body>
</html>