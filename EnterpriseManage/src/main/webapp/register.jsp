<%--
  Created by IntelliJ IDEA.
  User: Admin_Scoheart
  Date: 2022/11/5
  Time: 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form action="/EnterpriseManage/AdminRegisterServlet" method="post">
    <br><br><br>
    <input type="text" name="username" placeholder="账号"><br>
    <input type="password" name="password" placeholder="密码"><br>
    <input type="submit" value="注册">
    <p>${register_msg}</p>
</form>


</body>
</html>
