<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>정보입력</h1>

<form action="user" method="post">
   이름 : <input type="text" name="name"><p>
   전화 : <input type ="text" name ="tel"><p>
   이메일:<input type ="text" name="email"><p>
   <input type="submit" value="입력">
   <input type="reset"    value="취소">
</form>
</body>
</html>