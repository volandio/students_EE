<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 11.10.2017
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="static StudentsWithJDBCAndDAO.DB.DAO.StudentDAO.deleteStudentById" %>

<html>
<head>
    <title>Students</title>
</head>
<body>
<%--<%=request.getParameter("loginStudents")%>--%>

<table>
    <tbody>
    <tr>
        <th>Id</th>
        <th>firstName</th>
        <th>secondName</th>
        <th>familyName</th>
        <th>birth date</th>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td><c:out value="${item.num}"/></td>
            <td><c:out value="${item.firstName}"/></td>
            <td><c:out value="${item.secondName}"/></td>
            <td><c:out value="${item.familyName}"/></td>
            <td><c:out value="${item.bdate}"/></td>

            <td><a href= <%= deleteStudentById() %>"/${item.num}">Удалить</a></td>
            <%--<input type="button" id="button" value="Кнопка"/>--%>
            <%--<script>--%>
                <%--button.onclick = function () {--%>
                    <%--<%= deleteStudentById() %>--%>
                <%--};--%>
            <%--</script>--%>
                <%--<form id="form1">--%>
                <%--<button onclick= deleteS id="delete"> print OK</button>--%>
                <%--</form>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
