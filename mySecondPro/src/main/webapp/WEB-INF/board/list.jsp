<%@page import="board.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�Խ���</title>
</head>
<body>
	<%--  <% List<BoardDTO> boardlist  =
			(List<BoardDTO>)request.getAttribute("board_list"); 
	   int size = boardlist.size();	%> --%>
	<table width="100%" cellpadding="0" cellspacing="0" border="0">
		<tr height="5">
			<td width="5"></td>
		</tr>
		<tr
			style="text-align: center;">
			<td width="5"></td>
			<td width="73">��ȣ</td>
			<td width="379">����</td>
			<td width="73">�ۼ���</td>
			<td width="164">�ۼ���</td>
			<td width="58">��ȸ��</td>
			<td width="7"></td>
		</tr>
		<c:forEach var="board" items="${boardlist}" >
			<tr>
				<td>${user.}</td>
				<td>${user.name}</td>
				<td>${user.addr}</td>
				<td>${user.deptno}</td>
			</tr>
		</c:forEach>
		<tr height="25" align="center">
		</tr>
		<tr height="1" bgcolor="#D2D2D2">
			<td colspan="6"></td>
		</tr>

		<tr height="1" bgcolor="#82B5DF">
			<td colspan="6" width="752"></td>
		</tr>
	</table>

	<table width="100%" cellpadding="0" cellspacing="0" border="0">
		<tr>
			<td colspan="4" height="5"></td>
		</tr>
		<tr align="center">
			<td><input type=button value="�۾���"></td>
		</tr>
	</table>
</body>
</html>