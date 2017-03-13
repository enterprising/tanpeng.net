<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<title>一个提升自己的平台</title>

<!-- load stylesheets -->

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<!-- Bootstrap style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/templatemo-style.css" />
<!-- Templatemo style -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
</head>

<body>

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
						<li class="nav-item active"><a
							href="${pageContext.request.contextPath}/jsp/index.jsp"
							class="nav-link">主页</a></li>
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/jsp/resume.jsp"
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

	<div class="tm-home-img-container">
		<img src="${pageContext.request.contextPath}/img/tm-home-img.jpg"
			alt="Image" class="hidden-lg-up img-fluid" />
	</div>

	<section class="tm-section">
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-xs-center">
				<h2 class="tm-gold-text tm-title">Introduction</h2>
				<p class="tm-subtitle">这里是tanpeng的个人网站，欢迎访问。里面主要包含简历、博客及联系方式等。</p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

				<div class="tm-content-box">
					<img
						src="${pageContext.request.contextPath}/img/tm-img-310x180-1.jpg"
						alt="Image" class="tm-margin-b-20 img-fluid" />
					<h4 class="tm-margin-b-20 tm-gold-text">所获荣誉</h4>
					<p class="tm-margin-b-20">校级二等奖学金</p>
					<p class="tm-margin-b-20">校级优秀团员</p>
					<p class="tm-margin-b-20">优秀学生干部</p>
					<a href="${pageContext.request.contextPath}/jsp/resume.jsp" target="_blank" class="tm-btn text-uppercase">查看更多</a>
				</div>

			</div>

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

				<div class="tm-content-box">
					<img
						src="${pageContext.request.contextPath}/img/tm-img-310x180-2.jpg"
						alt="Image" class="tm-margin-b-20 img-fluid" />
					<h4 class="tm-margin-b-20 tm-gold-text">校内经历</h4>
					<p class="tm-margin-b-20">班长/2015.3-至今</p>
					<p class="tm-margin-b-20">班长/2015.3-至今</p>
					<a href="${pageContext.request.contextPath}/jsp/resume.jsp" target="_blank" class="tm-btn text-uppercase">查看更多</a>
				</div>

			</div>

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

				<div class="tm-content-box">
					<img
						src="${pageContext.request.contextPath}/img/tm-img-310x180-3.jpg"
						alt="Image" class="tm-margin-b-20 img-fluid" />
					<h4 class="tm-margin-b-20 tm-gold-text">技能</h4>
					<p class="tm-margin-b-20">熟练使用Java，有C/C++、Python等开发经验；</p>
					<p class="tm-margin-b-20">熟练掌握Java Web编程</p>
					<p class="tm-margin-b-20">掌握常用数据结构与算法；</p>
					<a href="${pageContext.request.contextPath}/jsp/resume.jsp" target="_blank" class="tm-btn text-uppercase">查看更多</a>
				</div>

			</div>

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">

				<div class="tm-content-box">
					<img
						src="${pageContext.request.contextPath}/img/tm-img-310x180-4.jpg"
						alt="Image" class="tm-margin-b-20 img-fluid" />
					<h4 class="tm-margin-b-20 tm-gold-text">兴趣爱好</h4>
					<p class="tm-margin-b-20">编程</p>
					<p class="tm-margin-b-20">运动、健身</p>
					<p class="tm-margin-b-20">电影、动漫</p>
					<a href="${pageContext.request.contextPath}/jsp/resume.jsp" target="_blank" class="tm-btn text-uppercase">查看更多</a>
				</div>

			</div>
		</div>
		<!-- row -->

		<div class="row tm-margin-t-big">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">
				<div class="tm-2-col-left">

					<h3 class="tm-gold-text tm-title">${articleM.articleName }</h3>
					<p class="tm-margin-b-30">${articleM.articleDesc }</p>
					<img
						src="${pageContext.request.contextPath}/img/${articleM.articlePic}"
						alt="Image" class="tm-margin-b-40 img-fluid" />
					<p class="m-b-2">${articleM.articleContent }</p>

					<a href="#" class="tm-btn text-uppercase">阅读全文</a>

				</div>
			</div>

			<div class="copyrights">
				Collect from <a href="http://www.cssmoban.com/" title="网站模板">网站模板</a>
			</div>

			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6 col-xl-6">

				<div class="tm-2-col-right">

					<div class="tm-2-rows-md-swap">
						<div class="tm-overflow-auto row tm-2-rows-md-down-2">
							<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6">
								<h3 class="tm-gold-text tm-title">分类</h3>
								<div
									style="overflow: scroll;overflow-x: hidden;overflow-y:hidden;">
									<nav>
									<ul class="nav">
										<c:forEach items="${categoryList }" var="categoryList"
											varStatus="cate">
											<li><a href="#" class="tm-text-link">${categoryList.categoryName }</a></li>
										</c:forEach>
									</ul>
									</nav>
								</div>
							</div>
							<!-- col -->

							<div
								class="col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6 tm-xs-m-t">
								<h3 class="tm-gold-text tm-title">相关链接</h3>
								<nav>
								<ul class="nav">
									<c:forEach items="${linkList }" var="linklist" varStatus="link">
										<li><a href="${linklist.linkHref }" target="_blank" class="tm-text-link">${linklist.linkName }</a></li>
									</c:forEach>
								</ul>
								</nav>
							</div>
						</div>
						<div class="row tm-2-rows-md-down-1 tm-margin-t-mid">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
								<h3 class="tm-gold-text tm-title tm-margin-b-30">相关阅读</h3>

								<c:forEach items="${articleXiangguanList }"
									var="articleXiangguanList" varStatus="Slist">
									<div class="media tm-related-post">
										<div class="media-left media-middle">
											<a href="#"> <img class="media-object"
												src="${pageContext.request.contextPath}/img/${articleXiangguanList.articlePic}"
												alt="Generic placeholder image" />
											</a>
										</div>
										<div class="media-body">
											<a href="#"><h4
													class="media-heading tm-gold-text tm-margin-b-15">${articleXiangguanList.articleName }</h4></a>
											<p class="tm-small-font tm-media-description">${articleXiangguanList.articleDesc }</p>
										</div>
									</div>
								</c:forEach>

							</div>
						</div>

						<!-- col -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- row -->

	</div>
	</section>

	<footer class="tm-footer">
	<div class="container-fluid">
		

		<div class="row">
			<div class="col-xs-12 tm-copyright-col">
				<p class="tm-copyright-text" style="text-align:center;" >
					Copyright 2016-2017 tanpeng.net &nbsp;&nbsp;&nbsp;湘ICP备16003539号-1
				</p>
			</div>
		</div>
	</div>
	</footer>

	<!-- load JS files -->
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
	<!-- jQuery (https://jquery.com/download/) -->
	<script src="${pageContext.request.contextPath}/js/tether.min.js"></script>
	<!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>