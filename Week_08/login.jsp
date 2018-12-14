<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		class Invalid extends Exception{
		Invalid(String s){
			super(s);
		}
	}
	%>

	<%!String username,password;%>
	<%
		username=request.getParameter("name");
		password=request.getParameter("password");
		if(username.equals("ADMIN")&&password.equals("ADMIN123")){%>
		<strong>Welcome, <%=username %></strong>	
	<%} else {%>
		Exception :<%=new Invalid("Invalid Credentials") %>
	<%} %>
</body>
</html>
