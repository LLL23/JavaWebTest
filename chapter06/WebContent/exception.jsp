<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exception object test</title>
</head>
<body>
<%
   int a = 3;
   int b = 0;
%>
输出结果为:<%= (a/b) %>
</body>
</html>