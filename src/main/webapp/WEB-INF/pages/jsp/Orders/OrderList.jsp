<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Orders</title>
<meta charset="UTF-8">
</head>
<body data-ng-app="orderApp" style="font-family: sans-serif;">
	<div class="container">
		<div data-ng-controller="orderController">
			<h3 style="color: blue; font-family: sans-serif;">Orders:</h3>
			<br>
			<table class="table table-striped" border="1" style="width: 100%;">
				<tr>
					<th width="10%">Id</th>
					<th width="15%">Username</th>
					<th width="15%">User Name</th>
					<th width="15%">Book Id</th>
				</tr>
<!-- 				<tr data-ng-repeat="dt in data"> -->
<!-- 					<td>{{dt.orderId}}</td> -->
<!-- 					<td>{{dt.username}}</td> -->
<!-- 					<td>{{dt.}}</td> -->
<!-- 					<td>{{dt.phone}}</td> -->
<!-- 					<td>{{dt.email}}</td> -->
<!-- 					<td>{{dt.status}}</td> -->
<!-- 				</tr> -->
			</table>
		</div>
	</div>
</body>
</html>