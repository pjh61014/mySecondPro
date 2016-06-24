<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<form method="post" enctype="multipart/form-data" 
	      action="/secondPro/upload.do">
		제목:<input type="text" name="title"/>
		<p/>
		성명:<input type="text" name="name"/>
		<p/>
		파일:<input type="file" name="upFile"/>
		<p/>
		<input type="submit" value="데이터 전송"/>
	</form>
</body>
</html>















