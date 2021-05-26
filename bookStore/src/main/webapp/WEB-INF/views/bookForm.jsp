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
				<th><h2>도서입력</h2></th>
			</tr>
			<tr>
				<th>일련번호</th>
				<th>도서명</th>
				<th>저자</th>
				<th>가격</th>
				<th>표지</th>
			</tr>
			<form action="bookSave" method="post" >
				<tr>
					<td><input type="text" name="serial"> </td>
					<td><input type="text" name="name"></td>
					<td><input type="text" name="author"></td>
					<td><input type="text" name="price"></td>
					<td><input type="file" name="image"></td>
				</tr>
				
				<tr>
					<td>
					<input type="submit" value="저장">
					</td>
				</tr>
			</form>
			
			
		</table>
	</body>
</html>