<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 12.10.2017
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CreateUser</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/userCreate" method="POST">
    <table>
        <tr>
            <td align="right" >Имя : </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td align="right" >Пароль : </td>
            <td>
                <input type="text" name="password">
            </td>
        </tr>
            <td><input type="submit" align="center" value="Создать"/></td>
        </tr>
    </table>
</form>
</body>
</html>
