<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello</title>
</head>
<body>
연습 Spring
<%= "안녕하세요" %>
<br><br>
<%for(int i=0; i<5; i++) { %>
<p><%=i %>번째 줄입니다."<p>
<%} %>
</body>
</html>