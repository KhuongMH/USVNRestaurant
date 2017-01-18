<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Log-in</title>

<link rel='stylesheet'
	href='http://codepen.io/assets/libs/fullpage/jquery-ui.css'>

<link rel="stylesheet"
	href="<c:url value="/resources/admin/css/style.css" />" media="screen"
	type="text/css" />

</head>

<body>

	<div class="login-card">
		<h1>Log-in</h1>
		<br>
		<form:form class="form-signin" action="/AdminPanel/login"
			method="POST">
			<input type="text" name="user" placeholder="Username">
			<input type="password" name="pass" placeholder="Password">
			<input type="submit" name="login" class="login login-submit"
				value="login">
		</form:form>
	</div>

	<script
		src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>
</body>
</html>

