<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p1" class="demoJavaBean.Person"></jsp:useBean>
<jsp:setProperty property="name" name="p1" value = "Ramesh"/>
<jsp:setProperty property="age" name="p1" value = "20"/>
Your good name is: <jsp:getProperty property="name" name="p1"/><br>
Your age is: <jsp:getProperty property="age" name="p1"/><br>
<%
demoJavaBean.Person p2 = new demoJavaBean.Person();
p2.setName("Mahima");
p2.setAge(33);
out.println("Name: "+ p2.getName());
out.println("<br>Age: "+ p2.getAge());
%>
</body>
</html>