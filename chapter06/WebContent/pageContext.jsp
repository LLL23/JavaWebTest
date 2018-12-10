<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext</title>
</head>
<body>
<%
   HttpServletRequest req =(HttpServletRequest) pageContext.getRequest();
   pageContext.setAttribute("str", "java",pageContext.PAGE_SCOPE);
   req.setAttribute("str", "Java Web");
   String str1 =(String) pageContext.getAttribute("str",pageContext.PAGE_SCOPE);
   String str2 =(String) pageContext.getAttribute("str",pageContext.REQUEST_SCOPE);
%>
<%="page范围:"+str1%><br>
<%="request范围:"+str2%><br>
</body>
</html>