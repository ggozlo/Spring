<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.expression.BeanFactoryAccessor"%>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.awt.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>


<h3>
이름: ${scoreCal.getName() }<br/>
국어: ${scoreCal.getKor() }<br/>
영어: ${scoreCal.getEng() }<br/>
수학: ${scoreCal.getMat() }<br/>
총점: ${scoreCal.getTotal() }<br/>
평균: ${scoreCal.getAverage() }<br/>
학점: ${scoreCal.getGrade() }
</h3>



</body>
</html>