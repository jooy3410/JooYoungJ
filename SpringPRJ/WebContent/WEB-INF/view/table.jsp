<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>table</title>
</head>
<body>
<table border=1>
	
	<%for(int a=0; a<3; a++) { %>
	<tr>
		<%for(int k=0; k<4; k++) {%>
		<td> <%=a %>행 <%=k %>열</td>
		<%} %>
	</tr>
	<%} %>
</table>

</body>
</html>