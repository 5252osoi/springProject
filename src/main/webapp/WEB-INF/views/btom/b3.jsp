<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b3.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
  <h2>btom 폴더의 b3.jsp 입니다.</h2>
  <%-- <div> <a href="${ctp}/btom/b2" class="btn btn-info">b2호출</a></div> --%>
  <div> <a href="b3?name=btom" class="btn btn-info">b3호출</a></div>
  <hr/>
  <div>
  	<c:if test="${!empty name}">넘어온 이름 : ${name}</c:if><br/>
  	<c:if test="${!empty name}">넘어온 이름 : ${param.name}</c:if><br/>
  	<c:if test="${!empty age}">넘어온 나이 : ${age}</c:if>
  	
  </div>
  <hr/>
  <div>
<!--   	<form name="myform" method="post" action="b2Ok"> -->
  	<form method="post">
  		<div>성명 : <input type="text" name="name" value="${name}" class="form-controll mb-2"/></div>
  		<div>나이 : <input type="number" name="age" value="${age}" min="0" max="99" class="form-controll mb-2"/></div>
  		<div><input type="submit" value="전송" class="btn btn-primary"/></div>
  	</form>
  </div>
  <hr/>
  <p>
  	<a href="${ctp}/" class="btn btn-warning">Home</a>
  </p>
</div>
<p><br/></p>
</body>
</html>