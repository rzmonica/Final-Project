<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Digital Library</title>
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
</head>
<body>
	<div class="container">
		<br>
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar-1">
							<span class="sr-only">Menu </span> <span class="icon-bar"></span>
							<span class="icon-bar"></span> <span class="icon-bar"></span>
						</button>

						<a href="index.html" class="navbar-brand">Digital Library</a>
					</div>
					<div class="collapse navbar-collapse" id="navbar-1">
						<ul class="nav navbar-nav navbar-right">
							<li class="active"><a href="/finalproject/home">Home</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button"> Books <span
									class="caret"></span>
							</a>
								<ul class="dropdown-menu">
									<li><a href="/finalproject/book/list">Catalog</a></li>
									<li><a href="/finalproject/book/create">Add Book</a></li>
								</ul></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button"> Users <span
									class="caret"></span>
							</a>
								<ul class="dropdown-menu">
									<li><a href="/finalproject/user/list">View Users</a></li>
									<li><a href="/finalproject/user/create">Add User</a></li>
								</ul></li>
							<li><a href="/finalproject/order">Orders</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
</body>
</html>


