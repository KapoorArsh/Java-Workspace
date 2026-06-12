<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${income}"/>
<c:if test="${income<2000}">
<c:out value="${income}"></c:out>
</c:if>
<c:import url="http://www.google.com" var="data"></c:import>
<c:out value="${data}"/>

<c:catch var="CatchException">
<% int x=20/0; %>
</c:catch>

<c:if test="${CatchException!=null}">
<h1>The type of exception is : ${CatchException}</h1>
<h1>There is an exception ${CatchException.message}</h1>
</c:if>
</body>
</html>