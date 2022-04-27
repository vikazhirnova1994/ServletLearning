<%
    java.util.Date data =   new java.util.Date();
    String curDate = "Текущая дата: " + data;
%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%= curDate %>
<h1><%= "Список сервлетов" %></h1>
<br/>
<a href="myFirstServlet">FirstServlet</a>
<br/>
<a href="myForwardServlet">Forward</a>
<br/>
<a href="myRedirectServlet">Redirect</a>
<br/>
<a href="countSessionServlet">Count Session</a>
<br/>
<a href="myCardServlet">Card Session</a>
<br/>
<a href="library">Library</a>
<br/>
<a href="header">Header</a>
<br/>
<a href="setCookiesServlet">Set Cookies</a>
<br/>
<a href="getCookiesServlet">Get Cookies</a>
<br/>
<a href="deleteCookiesServlet">Delete Cookies</a>
<p>
</p>
</body>
</html>