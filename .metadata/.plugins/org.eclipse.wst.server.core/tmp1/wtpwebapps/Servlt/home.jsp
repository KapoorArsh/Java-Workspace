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
	String myname=(String)session.getAttribute("name1");
	%>
	<h1>Welcome:<%= myname %></h1>
	<a href="Profile.jsp">Profile</a><br>
	<a href="about.jsp">About</a>
</body>
</html>