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
<c:url value="/j_spring_security_check" var="login" />
<c:if test="${param.fail }" > 
	로그인 실패!
</c:if>
<c:if test="${param.fail == null }" > 
	로그인 정보 없음!
</c:if>


<h1>로그인</h1>
<form action="${login }" method="post">
   아이디 : <input type="text" name="j_id"><p>
   패스워드 : <input type ="text" name ="j_pw"><p>

   <input type="submit" value="로그인">
   <input type="reset"    value="취소">
</form>

</body>
</html>