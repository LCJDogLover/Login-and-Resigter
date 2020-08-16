<%--
  Created by IntelliJ IDEA.
  User: chaojunli
  Date: 2020/8/16
  Time: 5:44 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/rootreg">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="管理员注册">
</form>

</body>
</html>
