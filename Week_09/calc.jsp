<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! double output;
	double radian;
%>
<%
	String number=request.getParameter("number");
	double num=Integer.parseInt(number);
	String oper=request.getParameter("oper");
	if(oper.equals("sine")){
		radian=Math.toRadians(num);
		output=Math.sin(radian);
	}
	else if(oper.equals("cosine")){
		radian=Math.toRadians(num);
		output=Math.cos(radian);
	}
	else if(oper.equals("tan")){
		radian=Math.toRadians(num);
		output=Math.tan(radian);
	}
	else if(oper.equals("log")){
		output=Math.log(num);
	}
	else if(oper.equals("root")){
		output=Math.sqrt(num);
	}
%>
<h1>Operation: </h1><%=oper %>
<h1>Output:</h1><%=output %>
<button ><a href=calculator.html>Return Back</a></button>
</body>
</html>
