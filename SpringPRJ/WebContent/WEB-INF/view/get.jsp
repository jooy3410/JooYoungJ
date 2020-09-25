<%@page import="poly.util.CmmUtil"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String name = CmmUtil.nvl((String)request.getAttribute("name"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	안녕하세요, <%=name %>님!
</body>
</html>