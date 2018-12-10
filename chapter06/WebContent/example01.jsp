<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP声明语句</title>
<%!
     int a  = 1,b=2;
%>
<%!
     public String print(){
	String str = "niit";
	return str;
}
%>
</head>
<body>
<%
    out.println(a+b);
%>
<br>
<%
   out.println(print());
%>
<%= 
    a+b
%>
<%=
    print()
%>
</body>
</html>