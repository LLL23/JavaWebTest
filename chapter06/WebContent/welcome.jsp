<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome page</title>
</head>
<body>
你好，欢迎进入首页，当前访问时间是:
<%
out.println(new java.util.Date());
%>
</body>
</html>