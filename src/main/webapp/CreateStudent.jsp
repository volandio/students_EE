
<%@ page contentType="text/html;charset=cp1251" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/create" method="POST">
    <table>
        <tr>
            <td align="right" >��� : </td>
            <td>
                <input type="text" name="firstName">
            </td>
        </tr>
        <tr>
            <td align="right" >�������� : </td>
            <td>
                <input type="text" name="secondName">
            </td>
        </tr>
        <tr>
            <td align="right" >������� : </td>
            <td>
                <input type="text" name="familyName">
            </td>
        </tr>
        <tr>
            <td align="right" >���� : </td>
            <td>
                <input type="text" name="bdate">
            </td>
        </tr>
        <tr>
            <td><input type="submit" align="center" value="�������"/></td>
        </tr>
    </table>
</form>
</body>
</html>
