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
<title>我的收藏</title>
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
		initCollectionsPage();
	});
</script>
</head>
<body>
	<header class="secondHeader">
	<div class="title">
		<a class="backHref" id="mainPageHref"><img
			src="<%=request.getContextPath()%>/assets/img/back.png" width="25px"
			height="25px" /></a>我的收藏
	</div>
	</header>
	<div class="content thirdContent">
		<hr />
		<div class="group">
			<span class="item">数学<a class="itemRight"><img alt="数学"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">英语<a class="itemRight"><img alt="英语"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">语文<a class="itemRight"><img alt="语文"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
		</div>
	</div>
</body>
</html>