<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello-World</title>
</head>
<body>
<%=new GregorianCalendar().get(Calendar.HOUR_OF_DAY)%>:
<%=new GregorianCalendar().get(Calendar.MINUTE)%>:
<%=new GregorianCalendar().get(Calendar.SECOND)%>
<h1>Good <% if (new GregorianCalendar().get(Calendar.HOUR_OF_DAY) < 12) {%>Morning<% } else { %>Afternoon<% } %></h1>
</body>
</html>