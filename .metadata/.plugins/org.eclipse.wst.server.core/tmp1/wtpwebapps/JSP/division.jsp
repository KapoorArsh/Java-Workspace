<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="exception.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String num1=request.getParameter("firstnum");
	String num2=request.getParameter("secondnum");
	int v1 = Integer.parseInt(num1);
	int v2 = Integer.parseInt(num2);
	int res = v1/v2;
	out.print("Output is: " + res);
	%>
</body>
</html>