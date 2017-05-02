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
    <script>
        //        function checkform() {
        //            var isbn13 = $("#isbn13").val();
        //            console.log(isbn13);
        //            if(!isbn13.isNumeric() || isbn13.length != 13){
        //                $("#errorMsg").append("请输入正确的ISBN 编号");
        //                $("#isbn13").text = "";
        //                return false;
        //            } else{
        //                return true;
        //            }
        //        }
    </script>
</head>
<body>
<%@include file="../common/header.jsp" %>
<div class="container">
    <form action="/basebook/search" method="get">
        <div class="form-group">
            <label for="isbn13">ISBN编码: </label>
            <input name="isbn13" type="text" id="isbn13" placeholder="ISBN13">
        </div>
        <div id="errorMsg">

        </div>
        <button id="submitBtn" type="submit" class="btn btn-default">搜索</button>
    </form>
    <div id="basebookinfo">
        <table class="table table-hover">
            <tr>
                <td rowspan="5">
                    <%--<img src={requestScope.basebook.getImagePath()}>--%>
                    <img src=${requestScope.basebook.getImagePath()}>
                </td>
                <td>
                    ${requestScope.basebook.getBookName()}
                </td>
            </tr>
            <tr>
                <td>
                    ${requestScope.basebook.getAuthor()}
                </td>
            </tr>
            <tr>
                <td>
                    ${requestScope.basebook.getAuthorIntro()}
                </td>
            </tr>
            <tr>
                <td>
                    ${requestScope.basebook.getIsbn13()}
                </td>
            </tr>
            <tr>
                <td>
                    ${requestScope.basebook.getPublisher()}
                </td>
            </tr>
            <tr>
                <td>
                    ${requestScope.basebook.getSummary()}
                </td>
            </tr>
        </table>
    </div>
</div>
<%@include file="../common/footer.jsp" %>
</body>
<script type="text/javascript" src="<%=basePath%>js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
</html>

