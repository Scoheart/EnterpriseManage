<%--
  Created by IntelliJ IDEA.
  User: Admin_Scoheart
  Date: 2022/11/5
  Time: 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<h1>${register_msg}</h1>

<form action="/EnterpriseManage/AdminLoginServlet" method="post">
    <input type="text" name="username" value="${cookie.username.value}" placeholder="账号"><br>
    <input type="password" name="password" value="${cookie.password.value}" placeholder="密码"><br>
    记住密码<input type="checkbox" name="remember" value="1"><br>
    <input type="submit" value="登录">
    <p>${login_msg}</p>
</form>

<a href="register.jsp">没有账号</a>

</body>
</html>
