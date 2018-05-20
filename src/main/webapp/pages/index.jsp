<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Our
  Date: 20.05.2018
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<sec:authorize access="isAuthenticated()">
<form action="/logoutMe" method="post">
    <input type="submit">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>
</sec:authorize>
    <form action="saveMe" method="post">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <input name="username" placeholder="username">
        <input name="password" placeholder="password">
        <input type="submit">
    </form>

</body>
</html>
