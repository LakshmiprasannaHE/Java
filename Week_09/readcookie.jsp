<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookie=request.getCookies();
	for(int i=0;i<cookie.length;i++){%>
	<%=i +1%> <strong>Cookie id </strong><%=cookie[i].getName()%><br/>
			  <strong>Cookie value </strong><%=cookie[i].getValue() %><br/><br/>
	<% }
%>
</body>
</html>
