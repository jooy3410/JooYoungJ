<%@page import="static poly.util.CmmUtil.nvl"%>
<%@page import="poly.dto.EmpDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	List<EmpDTO> rList = (List<EmpDTO>)request.getAttribute("rList");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
	<td>EMPNO</td>
	<td>ENAME</td>
	<td>JOB</td>
	<td>MGR</td>
	<td>HIREDATE</td>
	<td>SAL</td>
	<td>COMM</td>
	<td>DEPTNO</td>
</tr>
<% for(EmpDTO e : rList) {%>
<tr>
	<td><%=e.getEmpno() %></td>
	<td><%=e.getEname() %></td>
	<td><%=e.getJob() %></td>
	<td><%=nvl(e.getMgr())%></td>
	<td><%=e.getHiredate()%></td>
	<td><%=e.getSal()%></td>
	<td><%=nvl(e.getComm())%></td>
	<td><%=e.getDeptno()%></td>
	
</tr>
<%} %>
</table>


</body>
</html>