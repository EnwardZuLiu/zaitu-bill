<%--
  Created by IntelliJ IDEA.
  User: enward
  Date: 2015/7/19
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/ticket.css">
<script src="http://apps.bdimg.com/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<div class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand hidden-sm">在途做单系统</a>
        </div>
        <nav class="navbar-collapse collapse" role="navigation">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> 主页</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> 个人信息</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-th-large"></span> 统计信息</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="<%=request.getContextPath()%>/ex/login/logout">
                            <strong>
                                退出
                            </strong>
                        </a>
                    </li>
                </ul>
            </div>

        </nav>
    </div>
</div>
