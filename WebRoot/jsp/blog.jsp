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
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>tanpeng.net</title>
<!--
Classic Template
http://www.cssmoban.com/tm-488-classic
-->
<!-- load stylesheets -->

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/templatemo-style.css">
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
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/jsp/index.jsp"
							class="nav-link">主页</a></li>
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/jsp/resume.jsp"
							class="nav-link">简历</a></li>
						<li class="nav-item  active"><a
							href="${pageContext.request.contextPath}/jsp/blog.jsp"
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

	<div class="tm-blog-img-container"></div>

	<section class="tm-section">
	<div class="container-fluid">
		<div class="row">

			<div class="col-xs-12 col-sm-12 col-md-9 col-lg-10 col-xl-10">
				<div class="tm-blog-post">
					<h3 class="tm-gold-text">博客还在开发当中 </h3>
					<p>敬请期待。。。</p>
					<img src="${pageContext.request.contextPath}/img/tm-img-1010x336-1.jpg" alt="Image"
						class="img-fluid tm-img-post" />

					<p>You can help templatemo by telling your friends about our
						HTML CSS templates. Praesent velit ante, congue ac dignissim in,
						vehicula sit amet urna. Fusce in dapibus quam, eget finibus velit.
						Nullam erat odio, vulputate id est ut, consequat rutrum justo.
						Vivamus vel leo vel nunc tincidunt mattis. Sed neque diam, semper
						suscipit dictum a, sodales ac metus. Class aptent taciti sociosqu
						ad litora torquent per conubia nostra, per inceptos himenaeos.</p>

					<p>Morbi vel pharetra massa, non iaculis tortor. Nulla
						porttitor tincidunt felis et feugiat. Vivamus fermentum ligula
						justo, sit amet blandit nisl volutpat id. Fusce sagittis ultricies
						felis, non luctus mauris lacinia quis. Ut fringilla lacus ac
						tempor ullamcorper. Mauris iaculis placerat ex et mattis.</p>

					<p>Quisque vel sem eu turpis ullamcorper euismod. Praesent quis
						nisi ac augue luctus viverra. Sed et dui nisi. Fusce vitae dapibus
						justo. Pellentesque accumsan est ac posuere imperdiet. Curabitur
						eros mi, lacinia at euismod quis, dapibus vel ligula. Ut sodales
						erat vitae nunc tempor mollis. Donec tempor lobortis tortor, in
						feugiat massa facilisis sed. Ut dignissim viverra pretium. In eu
						justo maximus turpis feugiat finibus scelerisque nec eros. Cras
						nec lectus tempor nibh vestibulum eleifend et ac elit.</p>

					<p>Sed vitae luctus libero. Nam sem neque, finibus id sem
						pharetra, cursus porttitor ligula. Praesent aliquam fermentum dui,
						vitae venenatis libero vulputate ac. Fusce bibendum scelerisque
						magna eget iaculis. Phasellus non arcu eu sem convallis semper.
						Duis vulputate dignissim rhoncus.</p>
				</div>

				<div class="row tm-margin-t-big">
					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">

						<div class="tm-content-box">
							<img src="${pageContext.request.contextPath}/img/tm-img-310x180-1.jpg" alt="Image"
								class="tm-margin-b-30 img-fluid" />
							<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #1</h4>
							<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
								consequat mauris dapibus id. Donec scelerisque porttitor
								pharetra</p>
							<a href="#" class="tm-btn text-uppercase">Detail</a>
						</div>

					</div>

					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">

						<div class="tm-content-box">
							<img src="${pageContext.request.contextPath}/img/tm-img-310x180-2.jpg" alt="Image"
								class="tm-margin-b-30 img-fluid" />
							<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #2</h4>
							<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
								consequat mauris dapibus id. Donec scelerisque porttitor
								pharetra</p>
							<a href="#" class="tm-btn text-uppercase">Read More</a>
						</div>

					</div>

					<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">

						<div class="tm-content-box">
							<img src="${pageContext.request.contextPath}/img/tm-img-310x180-3.jpg" alt="Image"
								class="tm-margin-b-30 img-fluid">
							<h4 class="tm-margin-b-20 tm-gold-text">Lorem ipsum dolor #3</h4>
							<p class="tm-margin-b-20">Aenean cursus tellus mauris, quis
								consequat mauris dapibus id. Donec scelerisque porttitor
								pharetra</p>
							<a href="#" class="tm-btn text-uppercase">Detail</a>
						</div>

					</div>
				</div>

			</div>

			<aside
				class="col-xs-12 col-sm-12 col-md-3 col-lg-2 col-xl-2 tm-aside-r">

			<div class="tm-aside-container">
				<h3 class="tm-gold-text tm-title">分类</h3>
				<nav>
					<ul class="nav">
						<c:forEach items="${categoryList }" var="categoryList"
							varStatus="cate">
							<li><a href="#" class="tm-text-link">${categoryList.categoryName }</a></li>
						</c:forEach>
					</ul>
				</nav>
				<hr class="tm-margin-t-small">
				<h3 class="tm-gold-text tm-title">链接</h3>
				<nav>
					<ul class="nav">
						<c:forEach items="${linkList }" var="linklist" varStatus="link">
							<li><a href="${linklist.linkHref }" target="_blank" class="tm-text-link">${linklist.linkName }</a></li>
						</c:forEach>
					</ul>
				</nav>
				<hr class="tm-margin-t-small">

				<div class="tm-content-box tm-margin-t-small">
					<a href="#" class="tm-text-link"><h4
							class="tm-margin-b-20 tm-thin-font">Duis sit amet tristique
							#1</h4></a>
					<p class="tm-margin-b-30">Vestibulum arcu erat, lobortis sit
						amet tellus ut, semper tristique nibh. Nunc in molestie elit.</p>
				</div>
				<hr class="tm-margin-t-small">
				<div class="tm-content-box tm-margin-t-small">
					<a href="#" class="tm-text-link"><h4
							class="tm-margin-b-20 tm-thin-font">Duis sit amet tristique
							#2</h4></a>
					<p>Vestibulum arcu erat, lobortis sit amet tellus ut, semper
						tristique nibh. Nunc in molestie elit.</p>
				</div>
				<hr class="tm-margin-t-small">
				<div class="tm-content-box tm-margin-t-small">
					<a href="#" class="tm-text-link"><h4
							class="tm-margin-b-20 tm-thin-font">Duis sit amet tristique
							#3</h4></a>
					<p>Vestibulum arcu erat, lobortis sit amet tellus ut, semper
						tristique nibh. Nunc in molestie elit.</p>
				</div>
			</div>


			</aside>

		</div>

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
	<script
		src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
	<!-- jQuery (https://jquery.com/download/) -->
	<script
		src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script>
	<!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>