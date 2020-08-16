<%--
  Created by IntelliJ IDEA.
  User: chaojunli
  Date: 2020/8/15
  Time: 3:33 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>login主页</title>
</head>
<body>
${error}
<form method="post" action="${pageContext.request.contextPath}/login">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="登录">
    <a href="${pageContext.request.contextPath}/insertPage" rel="external nofollow" >注册</a>
    <a href="${pageContext.request.contextPath}/Rootlogin" rel="external nofollow">管理员登录</a>
</form>
</body>
</html>
