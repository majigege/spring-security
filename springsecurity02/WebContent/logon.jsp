<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="true"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE html>
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:23 GMT -->
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>登录</title>

<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">

<link href="css/animate.min.css" rel="stylesheet">
<link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
<script>
	if (window.top !== window.self) {
		window.top.location = window.location;
	}
</script>
</head>

<body class="gray-bg">

	<div class="middle-box text-center loginscreen  animated fadeInDown">
		<div>
			<div>

				<h1 class="logo-name">HI</h1>

			</div>
			<h3>欢迎使用</h3>
		
		 <font color="red">
		 <!-- 授权失败后的消息 -->
		   ${SPRING_SECURITY_LAST_EXCEPTION.message}
        </font>

			<form class="m-t" action="login" method="post">
				<div class="form-group">
					<input type="email" class="form-control" placeholder="用户名"
						name="username">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="密码"
						name="password">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				</div>
				
				<button type="submit" class="btn btn-primary block full-width m-b">登
					录</button>


				<p class="text-muted text-center">
					<a href="login.html#"><small>忘记密码了？</small>
					</a> | <a href="register.html">注册一个新账号</a>
				</p>

			</form>
		</div>
	</div>
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>
</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:23 GMT -->
</html>