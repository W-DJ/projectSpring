<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" autoFlush="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="shortcut icon" href="#">
<link rel="stylesheet" href="/resources/style/common_style.css">
	  <link rel="stylesheet" href="/resources/style/main_style.css">
	  <link rel="stylesheet" href="/resources/style/indd.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/resources/script/script.js"></script>
</head>
<body>
<header>
	    <!--  헤더템플릿 시작, iframe으로 변경 -->
		<iframe src="/indd/header" scrolling="no" width="100%" frameborder=0 id="headerIfm"></iframe>
	    <!--  헤더템플릿 끝 -->   
  	</header>
	<div id="wrap">
		<h1>인덱스 페이지</h1>
		<hr>
		<!-- GNB 메뉴 시작 -->
		<nav>
			<ul>
				<li><a href="/">메인페이지</a></li>
				<li><a href="/list">목록</a></li>
				<li><a href="/create">회원가입</a></li>
				<li><a href="/NotWrite">글쓰기</a></li>
				<li><a href="/Notlist">글목록</a></li>
				
			</ul>
		</nav>
		<!-- GNB 메뉴 끝 -->
	</div>
	<!-- div#wrap  -->
</body>
</html>
