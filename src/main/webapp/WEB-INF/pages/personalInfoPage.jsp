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
<title>个人信息页面</title>
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
	$(function() {
		initPersonalInfoPage();
	});
</script>
</head>
<body>
	<header>
	<div class="title">
		<a class="backHref" id="mainPageHref"><img
			src="<%=request.getContextPath()%>/assets/img/back.png" width="25px"
			height="25px" /></a>个人信息
	</div>
	<div class="userInfo">
		<div class="userNameID">我的头像</div>
		<div class="forward">
			<img alt="用户图像"
				src="<%=request.getContextPath()%>/assets/img/user.png" width="50"
				height="50"> <a id="personalInfoHref"><img alt="查看用户个人信息"
				src="<%=request.getContextPath()%>/assets/img/forward.png"
				width="25px" height="25px"></a>
		</div>
	</div>
	</header>
	<div class="content secondContent">
		<hr />
		<div class="group">
			<span class="item">用户名<span class="itemRight">木鱼小仙儿<a id="userNameHref"><img
						alt="用户名"
						src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
						width="25px" height="25px"></a></span></span>
			<hr />
			<span class="item">ID<span class="itemRight">1234567</span></span>
			<hr />
			<span class="item">修改密码<span class="itemRight"><a id="passwordHref"><img
						alt="修改密码"
						src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
						width="25px" height="25px"></a></span></span>
		</div>
		<hr />
		<div class="space"></div>
		<div class="group">
			<span class="item">性别<span class="itemRight">女<a id="sexHref"><img
						alt="性别"
						src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
						width="25px" height="25px"></a></span></span>
			<hr />
			<span class="item">年级<span class="itemRight">七年级<a id="gradeHref"><img
						alt="年级"
						src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
						width="25px" height="25px"></a></span></span>
			<hr />
			<span class="item">学校<span class="itemRight">上海市 民立学校<a id="schoolHref"><img
						alt="学校"
						src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
						width="25px" height="25px"></a></span></span>
		</div>
	</div>
</body>
</html>