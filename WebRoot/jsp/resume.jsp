﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>tanpeng.net</title>
<!--
Classic Template
http://www.cssmoban.com/tm-488-classic
-->
<!-- load stylesheets -->

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/templatemo-style.css">
<!-- Templatemo style -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
</head>

<body style="text-align: center;">

	<div class="tm-header">
		<div class="container-fluid">
			<div class="tm-header-inner">
				<a href="${pageContext.request.contextPath}/index.jsp" class="navbar-brand tm-site-name">tanpeng.net</a>

				<!-- navbar -->
				<nav class="navbar tm-main-nav">

				<button class="navbar-toggler hidden-md-up" type="button"
					data-toggle="collapse" data-target="#tmNavbar">&#9776;</button>

				<div class="collapse navbar-toggleable-sm" id="tmNavbar">
					<ul class="nav navbar-nav">
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/jsp/index.jsp"
							class="nav-link">主页</a></li>
						<li class="nav-item active"><a
							href="${pageContext.request.contextPath}/jsp/about.jsp"
							class="nav-link">简历</a></li>
						<li class="nav-item"><a
							href="http://blog.tanpeng.net" target="_blank"
							class="nav-link">博客</a></li>
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/jsp/contact.jsp"
							class="nav-link">联系</a></li>
					</ul>
				</div>

				</nav>

			</div>
		</div>
	</div>

	<!-- <div class="tm-about-img-container"></div> -->

	<section class="tm-section-2">
	<div class="container-fluid-2" style="margin:0 auto; height:auto;width:auto; max-width: 1080px;max-height: 1920px;text-align:center;">
		<img src="${pageContext.request.contextPath}/img/jianli2.png" alt="个人简历" title="点击图片下载简历" onclick='window.open("${pageContext.request.contextPath}/res/18-tanpeng-15886309250.doc")' style="width:100%;max-width: 1076px; height: auto; display: block; vertical-align:middle;text-align: center;"/>
	</div>
	</section>

	<footer class="tm-footer">
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-12 tm-copyright-col">
				<p class="tm-copyright-text" style="text-align: c">
					Copyright 2016-2017 tanpeng.net &nbsp;&nbsp;&nbsp;湘ICP备16003539号-1
				</p>
			</div>
		</div>
	</div>
	</footer>

	<!-- load JS files -->
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
	<!-- jQuery (https://jquery.com/download/) -->
	<script
		src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script>
	<!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>