<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
</head>
<body style="background-image: url('${pageContext.request.contextPath}/images/bg.jpg')">
<div class="container">
    <div class="row" style="margin-bottom: 150px;">
        <h2>11740 高德章</h2>
    </div>
    <div class="row col-md-offset-3 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">电影租赁管理系统</h3>
            </div>
            <div class="panel-body">
                <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/login.do">
                    <div class="form-group has-feedback" style="margin-top: 20px;">
                        <label for="username" class="col-md-3 control-label">用户名</label>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                            <input type="text" class="form-control" id="name" name="name" placeholder="用户名" autofocus>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <label for="password" class="col-md-3 control-label">密码</label>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                            <input type="password" class="form-control" id="password" placeholder="密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-3 col-md-9">
                            <button type="submit" class="btn btn-default">登录</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>