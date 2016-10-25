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
<title>学校</title>
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
		initSchoolAreaPage();
	});
</script>
</head>
<body>
	<header class="secondHeader">
	<div class="title">
		<a class="backHref" id="personalInfoPageHref"><img
			src="<%=request.getContextPath()%>/assets/img/back.png" width="25px"
			height="25px" /></a>学校
	</div>
	</header>
	<div class="content thirdContent">
		<hr />
		<div class="group">
			<span class="item">静安区<a class="itemRight school"><img alt="静安区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">普陀区<a class="itemRight school"><img alt="普陀区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">长宁区<a class="itemRight school"><img alt="长宁区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">徐汇区<a class="itemRight school"><img alt="徐汇区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">宝山区<a class="itemRight school"><img alt="宝山区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">闸北区<a class="itemRight school"><img alt="闸北区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">浦东新区<a class="itemRight school"><img
					alt="浦东新区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">秦贤区<a class="itemRight school"><img alt="秦贤区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">崇明<a class="itemRight school"><img alt="崇明"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">嘉定区<a class="itemRight school"><img alt="嘉定区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">南汇区<a class="itemRight school"><img alt="南汇区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
			<span class="item">闵行区<a class="itemRight school"><img alt="闵行区"
					src="<%=request.getContextPath()%>/assets/img/forwardBlack.png"
					width="25px" height="25px"></a></span>
			<hr />
		</div>
	</div>
</body>
</html>