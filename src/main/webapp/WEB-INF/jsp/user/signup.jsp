<%--
  Created by IntelliJ IDEA.
  User: ljn19
  Date: 2017-03-31
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>用户注册</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css"/>
    <style>
        #page-header {
            padding-left: 20%;
        }

    </style>

</head>
<body>
<div class="page-header" id="page-header">
    <h1>Share Together&nbsp;<small>共享图书，共享快乐</small></h1>
</div>
<div id="content">
    <div class="container">
        <form id="signup_form" action="/user/signup" method="post">
            <div class="form-group">
                <label for="userid">用户名: </label>
                <input name="userId" type="text" id="userid"  placeholder="UserID">
            </div>
            <div class="form-group">
                <label for="username">真实姓名: </label>
                <input name="userName" type="text"  id="username" placeholder="UserName">
            </div>
            <div class="form-group">
                <label for="password">密码：</label>
                <input name="password" type="password"  id="password" placeholder="Password">
            </div>
            <div class="form-group">
                <label for="company">公司：</label>
                <input name="company" type="text" id="company" placeholder="Company">
            </div>
            <div class="form-group">
                <label for="department">部门：</label>
                <input name="department" type="text" id="department" placeholder="Department">
            </div>
            <div class="form-group">
                <label for="telephone">电话：</label>
                <input name="telephone" type="text"  id="telephone" placeholder="Telephone">
            </div>
            <div class="form-group">
                <label for="mobile">手机：</label>
                <input name="phone" type="text" id="mobile" placeholder="Mobile">
            </div>
            <button id="submitBtn" type="submit" class="btn btn-default">注册</button>
        </form>

    </div>
</div>

<%@include file="../common/footer.jsp"%>
</body>
<script type="text/javascript" src="<%=basePath%>js/modernizr.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
</html>
