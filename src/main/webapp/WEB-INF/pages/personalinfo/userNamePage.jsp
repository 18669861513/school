<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black" />
<title>用户名</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/assets/js/personalinfo/mainPage.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/bootstrap/css/bootstrap.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/personalinfo/mainPage.css" />
<script type="text/javascript">
	var staticURL = "<%=request.getContextPath()%>";
	$(function(){
		initUserNamePage();
	});
</script>
</head>
<body>
	<header class="secondHeader">
	<div class="title">
		<a class="backHref" id="personalInfoPageHref">取消</a>用户名 <a class="sendHref">保存</a>
	</div>
	</header>
	<div class="content thirdContent">
		<hr />
		<div class="group">
			<span class="item">木鱼小仙儿<span class="itemRight"><a
					id="userNameHref"><img alt="用户名"
						src="<%=request.getContextPath()%>/assets/img/close.png"
						width="25px" height="25px"></a></span></span>
		</div>
	</div>
</body>
</html>