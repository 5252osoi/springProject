<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>c1.jsp</title>
	<jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 c1.jsp입니다.</h2>
	<p>view자원을 관리하는 resources학습</p>
	<hr/>
	<div class="text-center row mb-2">
		<div class="col-2"><img src="/include/01.png" width="150px" alt="resources에 없으면 안나옴"/></div>
		<div class="col-2"><img src="/resources/02.png" width="150px" alt="경로가 제대로 지정안되면 안나옴"/></div>
		<div class="col-2"><img src="${ctp}/resources/0.png" width="150px" /></div>
		<div class="col-2"><img src="${ctp}/resources/images/0.png" width="150px"/></div>
		<div class="col-2"><img src="${ctp}/resources/images/temp/0.png" width="150px" /></div>
		</div>
		<div class="row text-center">
		<div class="col-2"><img src="${ctp}/images/1.png" width="150px"/></div>
		<div class="col-2"><img src="${ctp}/board/2.png" width="150px" /></div>
		<div class="col-2"><img src="${ctp}/pds/3.png" width="150px" /></div>
		<div class="col-2"><img src="${ctp}/pds/4.png" width="150px" /></div>
		<div class="col-2"><img src="${ctp}/images/pds/5.png" width="150px" /></div>
	</div>
	<hr/>
	<div>
	  	<a href="${ctp}/" class="btn btn-warning">Home</a>
	</div>
</div>
<p><br/></p>
</body>
</html>