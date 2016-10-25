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
<title>个人信息主页面</title>
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
		initMainPage();
	});
</script>
</head>
<body>
	<header>
	<div class="title">我的</div>
	<div class="userInfo">
		<div class="userImg">
			<img alt="用户图像"
				src="<%=request.getContextPath()%>/assets/img/user.png" width="50"
				height="50">
		</div>
		<div class="userNameID">
			<span>小七LV2(小仙儿)</span><br/><span>ID:1234567</span>
		</div>
		<div class="forward">
			<a id="personalInfoHref"><img alt="查看用户个人信息"
				src="<%=request.getContextPath()%>/assets/img/forward.png"
				width="25px" height="25px"></a>
		</div>
	</div>
	</header>
	<div class="content">
		<hr/>
		<div class="group">
			<a class="item" id="myQuestions">我的题库</a>
			<hr/>
			<a class="item" id="myCollections">我的收藏</a>
			<hr/>
			<a class="item" id="mistakeCollections">错题集</a>
		</div>
		<hr/>
		<div class="space"></div>
		<hr/>
		<div class="group">
			<a class="item">我的消息<span class="itemRight"><p class="circle">1</p></span></a>
			<hr/>
			<a class="item">我的积分</a>
		</div>
		<hr/>
		<div class="space"></div>
		<hr/>
		<div class="group">
			<a class="item" id="feedBack">意见反馈</a>
			<hr/>
			<a class="item">关于我们</a>
		</div>
	</div>
	<footer>
		<button type="button" class="btn">退出</button>
	</footer>
</body>
</html>