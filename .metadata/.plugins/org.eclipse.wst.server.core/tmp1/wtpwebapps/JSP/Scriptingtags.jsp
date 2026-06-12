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
	int a = 10;
	String name = "Noor";
	int square(){
		return a*a;
	}
	%>
	<%
	int b = 20;
	out.println("a :" + a+  "<br>");
	out.println("Name :" + name + "<br>");
	out.println(square() + "<br>");
	if(b<100){
		out.println("b is smaller than 100" + "<br>");
	}else{
		out.println("b is greater than 100" + "<br>");
	}
	for(int i=0;i<=5;i++){
		out.println(i);
	}
	%><br>
	<%= a %><br>
	<%= name %><br>
	<%= square() %><br>
	<%=Math.random() %><br>
</body>
</html>