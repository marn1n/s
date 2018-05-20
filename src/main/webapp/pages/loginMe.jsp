<%--
  Created by IntelliJ IDEA.
  User: Our
  Date: 20.05.2018
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/xxx" method="post">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <input name="usernameX" placeholder="usernameX">
    <input name="passwordX" placeholder="passwordX">
    <input type="submit">



</form>

</body>
</html>
