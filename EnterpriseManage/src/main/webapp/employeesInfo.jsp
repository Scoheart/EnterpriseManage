<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@ page import="com.scoheart.pojo.Employees" %><%--
  Created by IntelliJ IDEA.
  User: Admin_Scoheart
  Date: 2022/11/4
  Time: 2:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>employees infomation</title>
</head>
<body>

<table border="1">

    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>联系电话</td>
        <td>邮箱</td>
        <td>住址</td>
    </tr>

    <c:forEach items="${employees}" var="employess">
        <tr>
            <td>${employess.employeeId}</td>
            <td>${employess.employeeName}</td>
            <td>${employess.employeeSex}</td>
            <td>${employess.employeeAge}</td>
            <td>${employess.employeeTel}</td>
            <td>${employess.employeeEmail}</td>
            <td>${employess.employeeAddr}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
