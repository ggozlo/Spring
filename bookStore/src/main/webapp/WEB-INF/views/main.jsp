<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리시스템</title>
</head>
<body>
	<table>
			<tr>
				<th><h2>도서관리시스템</h2></th>
			</tr>
			<tr>
				<th>일련번호</th>
				<th>도서명</th>
				<th>저자</th>
				<th>가격</th>
				<th>표지</th>
				<th>비고</th>
			</tr>
			<c:forEach var="book" items="${list }">
				<tr>
					<td>${book.serial } </td>
					<td>${book.name }</td>
					<td>${book.author }</td>
					<td>${book.price }</td>
					<td>${book.image }</td>
					<td>
						<a href="modifyForm?serial=${book.serial }"><input type="submit" value="수정"> </a>
						<a href="delete?serial=${book.serial }"><input type="submit" value="삭제"> </a>
					</td>
				</tr>
			</c:forEach>
			<tr>
			</tr>
		</table>
		<a href="bookForm">입력하러가기</a>
</body>
</html>