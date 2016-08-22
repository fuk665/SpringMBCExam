<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>主页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
    
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    
	<script type="text/javascript">
		function getList(page) {
			$.getJSON(
				"${pageContext.request.contextPath}/list.do",
				{page:page},
				function(data,textStatus,ajax) {
					//alert(ajax.responseText);
					$.each(data,function(i,item){
						//alert(item.customerId);
						$("#table").append(
							"<tr>"+	
							"<td>"+"<a href='${pageContext.request.contextPath}/update.do?id="+item.customerId
							+"'>修改</a> | <a href='${pageContext.request.contextPath}/delete.do?id="+item.customerId
							+"'>删除</a>"+"</td>"+
	                        "<td>"+item.firstName+"</td>"+
	                        "<td>"+item.lastName+"</td>"+
	                        "<td>"+item.address.addressId+"</td>"+
	                        "<td>"+item.email+"</td>"+
	                        "<td>"+item.customerId+"</td>"+
	                        "<td>"+ formatDate(new Date(item.createDate)) +"</td>"+
							"</tr>"
						);
					});
				});
		};
		
		function formatDate(date) {
			return date.getFullYear()+"-"
			+(date.getMonth()+1)+"-"+date.getDate()
			+" "+formatNum(date.getHours())+":"+formatNum(date.getMinutes())
			+":"+formatNum(date.getSeconds());
		};
		
		function formatNum(number){
			if (number<10) {
				return "0"+number;
			}
			return number;
		};
		
		function addCus(){
			 window.location.href = '<%=basePath%>toAdd.jsp';
		};
		
		function logout(){
			window.location.href='<%=basePath%>login.jsp';
		};
		
	</script>
</head>
<body onload="getList(0)">
<div class="container">
    <div class="row" style="background-color: rgb(45,195,232);height: 60px;line-height: 60px;">
        <div class="col-md-3" href="#" id="logo">
            <h3>电影租赁管理系统</h3>
        </div>
        <div class="col-md-offset-7 col-md-2">
            <span class="glyphicon glyphicon-user" style="font-size: 18px;">${currentUser}</span>
            <button type="button" color="gray" height="10px;" onclick="logout();" >退出系统</button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-2">
            <ul class="nav">
                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-stop"></i>
                        Customer管理
                        <span class="glyphicon glyphicon-chevron-right form-control-feedback"></span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-stop"></i>
                        Film管理
                        <span class="glyphicon glyphicon-chevron-right form-control-feedback"></span>
                    </a>
                </li>
            </ul>
        </div>
        <div class="col-md-10">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h2 class="panel-title">客户管理</h2>
                </div>
                <div class="panel-body">
                    	
                    	<table>
                    		<tr>
                    			<td width="250px;" >客户列表</td>
                    			<td>
                    				<input type="button" value="新建" onclick="addCus();" />
                    			</td>
                    		</tr>
                    	</table>
                </div>
                <table class="table table-striped" id="table">
                    <tr>
                        <th width="100px;" >操作</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>CustomerId</th>
                        <th>CreateDate</th>
                    </tr>

                </table>
                <div class="row">
                    <div class="col-md-offset-8 col-md-4">
                        <nav>
                            <ul class="pagination">
                                <li>
                                    <a href="#" aria-label="Previous">
                                        <span aria-hidden="true">&laquo;</span>
                                    </a>
                                </li>
                                <li><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li>
                                    <a href="#" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>