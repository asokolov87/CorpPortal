<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>ТКС"Нева"</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="../../resources/css/login.css"/>"/>
</head>
<body>
<div class="parent">
<div class="container">
	<section id="content">
		<form method="POST" action="<c:url value="/j_spring_security_check" />">
			<h1>Авторизация</h1>
			<div>
				<input type="text" placeholder="Логин" required="" id="username" name="j_username"/>
			</div>
			<div>
				<input type="password" placeholder="Password" required="" id="password" name="j_password"/>
			</div>
			<div>
				<table>
					<tr>
						<td><input type= "checkbox" name= "remember-me"/>Запомнить меня</td>
					</tr>
					<tr>
						<td><input type="submit" value="Войти" /></td>
					</tr>
				</table>
			</div>
		</form>
	</section>
</div>
</div>
</body>
</html>