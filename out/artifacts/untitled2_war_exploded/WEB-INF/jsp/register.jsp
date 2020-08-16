<%--
  Created by IntelliJ IDEA.
  User: chaojunli
  Date: 2020/8/15
  Time: 3:33 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/insert">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="注册">
</form>

</body>
</html>
