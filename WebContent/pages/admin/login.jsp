<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Login</title>

<!-- Bootstrap CSS -->
<link href="<c:url value="/resources/admin/css/bootstrap.min.css" />"
	rel="stylesheet">
<!-- bootstrap theme -->
<link href="<c:url value="/resources/admin/css/bootstrap-theme.css" />"
	rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link
	href="<c:url value="/resources/admin/css/elegant-icons-style.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/admin/css/font-awesome.css" />"
	rel="stylesheet">
<!-- Custom styles -->
<link href="<c:url value="/resources/admin/css/style.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/admin/css/style-responsive.css" />"
	rel="stylesheet">
</head>
<body class="login-img3-body">
	<div class="container">
		<form class="login-form" action="/AdminPanel/login" method="POST">
			<div class="login-wrap">
				<p class="login-img">
					<i class="icon_lock_alt"></i>
				</p>
				<div class="input-group">
					<span class="input-group-addon"><i class="icon_profile"></i></span>
					<input type="text" class="form-control" autofocus="" name="phone" placeholder="Phone Number">
				</div>
				<div class="input-group">
					<span class="input-group-addon"><i class="icon_key_alt"></i></span>
					<input type="password" class="form-control" name="password" placeholder="Password">
				</div>
				<button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
			</div>
		</form>
	</div>
</body>
</html>

