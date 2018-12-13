<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String cookiename[]={"USER123","USER234","USER345"};
		String cookievalue[]={"AB12","AC13","AD14"};
	%>
	<%
	for (int i=0;i<cookiename.length;i++){
		response.addCookie(new Cookie(cookiename[i],cookievalue[i]));
	}
	%>
</body>
</html>
