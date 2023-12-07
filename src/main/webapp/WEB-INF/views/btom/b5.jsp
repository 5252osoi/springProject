<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b5.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
  <h2>btom 폴더의 b5.jsp 입니다.</h2>
 <!--  <div> <a href="b4Path/btom/23/test" class="btn btn-info">b4호출</a></div> -->
  <div> <a href="b5?name=btom" class="btn btn-info">b5호출</a></div>
  <hr/>
  <div>
  	<form method="post">
  		<div>성명 : <input type="text" name="name" id="name" value="홍길동" class="form-control" /> </div>
  		<div>나이 : <input type="number" name="age" id="age" value="20" class="form-control" /> </div>
  		<div>아이디 : <input type="text" name="mid" id="mid" value="hkd1234" class="form-control" /> </div>
  		<div>비밀번호 : <input type="password" name="pwd" id="pwd" value="1234" class="form-control" /> </div>
  		<div>성별 : 
	  		<input type="radio" name="gender" id="gender" value="남자"  />남자 &nbsp;
	  		<input type="radio" name="gender" id="gender" value="여자" checked/>여자
	  	</div>
  		<div>주소 : <input type="text" name="address" id="address" value="서울" class="form-control" /> </div>
	  	<div><input type="submit" value="제출" class="btn btn-success mt-2 form-control"/> </div>
  	</form> 
  </div>
  <hr/>
    <div>
  	<c:if test="${!empty name}">넘어온 값 : ${name} / ${age} / ${mid} / ${pwd} / ${gender} / ${address}</c:if><br/>
  </div>
  <hr/>
  <p>
  	<a href="${ctp}/" class="btn btn-warning">Home</a>
  </p>
</div>
<p><br/></p>
</body>
</html>