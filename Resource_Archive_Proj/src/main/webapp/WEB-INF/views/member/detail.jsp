<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" autoFlush="true"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>상세 내용 보기</title>
<link rel="shortcut icon" href="#">
<link rel="stylesheet" href="/resources/style/style.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/resources/script/script.js"></script>
</head>
<body>
    <div id="wrap">
<h1>상세 내용 보기 화면</h1>
<hr>
<table id="memberTbl">
<tbody>
<tr>
<td>아이디</td>
<td>${data.uId}</td>
</tr>
<tr>
<td>비밀번호</td>
<td>${data.uPw}</td>
</tr>
<tr>
<td>이름</td>
<td>${data.uName}</td>
</tr>
<tr>
<td>Email</td>
<td>${data.uEmail}</td>
</tr>
</tbody>
</table>
<a href="/list">목록으로</a>
    </div>
    <!-- div#wrap  -->
</body>
</html>
