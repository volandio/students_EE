<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 11.10.2017
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/CreateStudent.jsp">Создать</a>
<table class="tg">
    <tbody>
    <tr>
        <th width="80">Id</th>
        <th width="120">firstName</th>
        <th width="120">secondName</th>
        <th width="120">familyName</th>
        <th width="120">birth date</th>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td><c:out value="${item.num}"/></td>
            <td><c:out value="${item.firstName}"/></td>
            <td><c:out value="${item.secondName}"/></td>
            <td><c:out value="${item.familyName}"/></td>
            <td><c:out value="${item.bdate}"/></td>
            <td><a href="${pageContext.servletContext.contextPath}/edit?id=${item.num}">Редактировать</a></td>
            <td><a href="${pageContext.servletContext.contextPath}/delete?id=${item.num}">Удалить</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
