<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vitaliy
  Date: 12.05.16
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Register User</h1>

<form:form action="saveUser" method="post" modelAttribute="newUser">

    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td>Mail:</td>
            <td><form:input path="mail"/></td>
        </tr>
        <tr>
            <td>Enabled:</td>
            <td><form:input path="enabled"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Save"></td>
        </tr>
    </table>

</form:form>
</body>
</html>
