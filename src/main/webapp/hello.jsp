<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 11.10.2017
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<%=request.getParameter("login")%>
<c:forTokens var="message" items="Artem, Vladimir, Pavel" delims="/">
    <c:out value="${message}"></c:out>
</c:forTokens>

<c:forEach items="${list}" var="item">
    <c:out value="${item.firstName}">
    </c:out>
</c:forEach>

</body>
</html>
