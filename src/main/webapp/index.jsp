<%--
  Created by IntelliJ IDEA.
  User: Alex Kukushkin
  Date: 10/10/2017
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student project</title>
</head>
<body>
<form id="myForm" method="post" action="/web/auth">
    <input type="text" name="login"/>
    <input type="password" name="password"/>
    <input type="submit" value="login"/>
</form>
<%double num = Math.random();%>
<%=num%>
<%=request.getRequestURL()%>
</body>
</html>
