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
		<h2>남은 잔액 : ${money.getMoney() }</h2>
		
		<table border="1px">
			<tr>
				<th>계좌주</th>
				<th>잔액</th>
			</tr>
			<c:forEach var="account" items="${accountList }">
				<tr>
					<td>${account.name }</td>
					<td>${account.money }</td>
				</tr>
			</c:forEach>
		</table>
		
		<div>	
			<h2>입금하기</h2>
			<form action="deposit" method="post">
				이름:<input type="text" name="name"><br/>
				금액:<input type="text" name="money"><br/>
				<input type="submit" value="입금">
			</form>
		</div>
		<div>
			<h2>출금하기</h2>
			<form action="withdraw" method="post">
				이름:<input type="text" name="name"><br/>
				금액:<input type="text" name="money"><br/>
				<input type="submit" value="출금">
			</form>
		</div>
		<div>
			<h2>계좌 생성하기</h2>
			<form action="createAccount" method="post">
				이름:<input type="text" name="name"><br/>
				<input type="submit" value="생성">
			</form>
		</div>
	
	</body>
</html>