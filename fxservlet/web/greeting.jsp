<%--
  Created by IntelliJ IDEA.
  User: lrrnn
  Date: 2018/8/26
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Java in JSP</h1>
    <%
        String[] arr = {"What's up?", "Hello", "It's a nice day"};
        String greeting = arr[(int)(Math.random() * arr.length)];
    %>
    <p><%= greeting%></p>
</body>
</html>
