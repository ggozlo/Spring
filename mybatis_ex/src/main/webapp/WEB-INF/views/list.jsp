<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list }" var="credit">
${credit.name }<br/>
${credit.tel }<br/>
${credit.address }<br/>
<a href="delete?name=${credit.name }">삭제</a>
<hr>
</c:forEach>
<a href="form">입력하러 가기</a>
</body>
</html>