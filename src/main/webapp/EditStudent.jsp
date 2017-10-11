<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 11.10.2017
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=cp1251" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/edit" method="POST">
    <input type="hidden" name="id" value="${student.num}">
    <table>
        <tr>
            <td align="right" >Имя : </td>
            <td>
                <input type="text" name="firstName" value="${student.firstName}">
            </td>
        </tr>
        <tr>
            <td align="right" >Отчество : </td>
            <td>
                <input type="text" name="secondName" value="${student.secondName}">
            </td>
        </tr>
        <tr>
            <td align="right" >Фамилия : </td>
            <td>
                <input type="text" name="familyName" value="${student.familyName}">
            </td>
        </tr>
        <tr>
            <td align="right" >Дата : </td>
            <td>
                <input type="text" name="bdate" value="${student.bdate}">
            </td>
        </tr>
        <tr>
            <td><input type="submit" align="center" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
