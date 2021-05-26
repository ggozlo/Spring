<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리시스템</title>
</head>
<body>
	<table>
			<tr>
				<th><h2>도서수정</h2></th>
			</tr>
			<tr>
				<th>일련번호</th>
				<th>도서명</th>
				<th>저자</th>
				<th>가격</th>
				<th>표지</th>
			</tr>
			<form action="modify" method="post">
				<tr>
					<td><input type="text" name="serial" value="${book.serial }" readonly="readonly"> </td>
					<td><input type="text" name="name" value="${book.name }"></td>
					<td><input type="text" name="author" value="${book.author }"></td>
					<td><input type="text" name="price" value="${book.price }"></td>
					<td><input type="file" name="image" value="${book.image }"></td>
				</tr>
				<tr>
					<td>
					<input type="submit" value="수정">
					</td>
				</tr>
			</form>
			
			
		</table>
</body>
</html>