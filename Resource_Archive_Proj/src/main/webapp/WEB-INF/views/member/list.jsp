<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" autoFlush="true"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="shortcut icon" href="#">
<link rel="stylesheet" href="/resources/style/style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/resources/script/script.js"></script>
</head>
<body>
	<div id="wrap">
	
	<nav>
<ul>
<li><a href="/">메인페이지</a></li>
<li><a href="/list">목록</a></li>
<li><a href="/create">회원가입</a></li>
</ul>
</nav>
		<h1>상세 내용 보기 화면</h1>
		<hr>
		<table id="memberTbl">
			<thead>
				<tr>
					<th>번호</th>
					<th>ID</th>
					<th>이름</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="row" items="${data}">
				<!--  이 데이터를 row라고 부를예정. -->
				<!-- row는 증감변수 왜 data를 쓰냐고? 컨트롤러에서 서비스를 통해 리스트로 자료를 가져왔는데 모델엔 뷰 클래스에서 가져올때 data라고 정함. -->
					<tr>
						<td>${row.no}</td>
						<td><a href="/detail?no=${row.no}"> ${row.uId} </a></td>
						<td>${row.uName}</td>
						<td>${row.uEmail}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a href="/create">회원가입</a>
		</div>
	</div>
	<!-- div#wrap  -->
</body>
</html>
