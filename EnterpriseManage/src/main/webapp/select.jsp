<%--
  Created by IntelliJ IDEA.
  User: Admin_Scoheart
  Date: 2022/11/5
  Time: 1:22
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

<h1>管理员:"${admin.name}", 欢迎你</h1>

<button><a href="/EnterpriseManage/selectAllEmployeesServlet">查询员工信息</a></button> <br><br>
<button><a href="/EnterpriseManage/selectAllEmployeesServlet">查询部门信息</a></button> <br><br>
<button><a href="/EnterpriseManage/selectAllEmployeesServlet">查询负责人信息</a></button> <br><br>
<button><a href="/EnterpriseManage/selectAllEmployeesServlet">查询管理信息</a></button> <br><br>
<button><a href="/EnterpriseManage/selectAllEmployeesServlet">查询工作信息</a></button> <br><br>
<button><a href="/EnterpriseManage/selectAllEmployeesServlet">查询管理员信息</a></button> <br><br>
<button><a href="/EnterpriseManage/index.html">返回</a></button> <br><br>

</body>
</html>
