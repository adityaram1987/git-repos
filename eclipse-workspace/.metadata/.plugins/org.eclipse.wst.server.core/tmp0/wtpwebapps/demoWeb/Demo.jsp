<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scripting Elements</h1>
<hr>
<h2>
<%!
    int a=10;
	int b=40;
	int i=1;
%>

<%
	int sum= a+b;
%>
The value of a is <%= a %>
The value of b is <%= b %>
The value of sum is <%= sum %>
You visited <%= i++ %>
</h2>
</body>
</html>