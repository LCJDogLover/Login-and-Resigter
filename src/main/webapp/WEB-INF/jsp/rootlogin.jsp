<%--
  Created by IntelliJ IDEA.
  User: chaojunli
  Date: 2020/8/16
  Time: 5:15 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>rootlogin主页</title>
</head>
<body>
${error}
<form method="post" action="${pageContext.request.contextPath}/rootlogin">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="管理员登录">
    <%--<a href="${pageContext.request.contextPath}/login" rel="external nofollow" >登录</a>--%>
    <a href="${pageContext.request.contextPath}/Rootreg" rel="external nofollow">管理员注册</a>
</form>
</body>
</html>
