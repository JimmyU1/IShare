<%--
  Created by IntelliJ IDEA.
  User: ljn19
  Date: 2017-03-31
  Time: 14:41
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
    <title>主页</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.css"/>
</head>
<body>
<%@include file="../common/header.jsp" %>
<div class="container">

    ${sessionScope.user.getUserId()}
</div>
<%@include file="../common/footer.jsp" %>
</body>
<script type="text/javascript" src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
</html>

