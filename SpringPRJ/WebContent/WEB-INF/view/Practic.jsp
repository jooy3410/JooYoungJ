<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello</title>
</head>
<body>
���� Spring
<%= "�ȳ��ϼ���" %>
<br><br>
<%for(int i=0; i<5; i++) { %>
<p><%=i %>��° ���Դϴ�."<p>
<%} %>
</body>
</html>