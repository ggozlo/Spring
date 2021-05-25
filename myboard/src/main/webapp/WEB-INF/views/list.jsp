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
	<table>
	<c:forEach items="${list }" var="dto">
	${dto.num } <br/>
	${dto.name } <br/>
	${dto.content } <br/>
	<a href="${pageContext.request.contextPath}/del?num=${dto.num }"><input type="button" value="삭제 "></a>
	<hr> 
	</c:forEach>
	</table>
</body>
</html>
