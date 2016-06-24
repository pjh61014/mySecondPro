<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %> <!-- taglib => 외부라이브러리를 추가할때 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#left{
		width : 25%;
		float : left;
	}
	#content{
		width : 75%;
		float : right;
	}

</style>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div id="left">
		<tiles:insertAttribute name="left"/>
	</div>
	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div>
</body>
</html>