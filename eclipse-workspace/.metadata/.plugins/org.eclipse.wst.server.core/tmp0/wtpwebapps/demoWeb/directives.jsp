<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info="Just for Demo" %>
<%@page session="true" %>

<body>
<h1>Directive Demo</h1>
<hr>
<h2>
Todays date : <%= new Date() %><br>
Exception : <%= exception %>> <br>
Information: <%= getServletInfo() %>
Session id: <%= session.getId() %>
<hr>
<%@include file="login.html" %>
<%@include file="login.html" %>
<%@include file="Abc.jsp" %>
</h2>

</body>
</html>