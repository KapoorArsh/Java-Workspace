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
String myname = (String)session.getAttribute("name1");
%>
	<h1>Welcome: <%= myname %></h1>
	<a href="home.jsp">Home</a><br>
	<a href="about.jsp">About</a><br>
	<a href="logout">Logout</a>
</body>
</html>