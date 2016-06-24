<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, emp.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>회원목록(MVC)</h1>
	
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th><spring:message code="member.form.id" /></th><th><spring:message code="member.form.pass" /></th><th><spring:message code="member.form.name" /></th>
			<th><spring:message code="member.form.addr" /></th><th>부서번호</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="user" items="${userlist}" >
			<tr>
				<td><a href="mybatisread.do?id=${user.id}">${user.id}</a></td>
				<td>${user.pass}</td>
				<td>${user.name}</td>
				<td>${user.addr}</td>
				<td>${user.deptno}</td>
				<td><a href="mybatisdelete.do?id=${user.id}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>










