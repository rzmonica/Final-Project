<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Users</title>
<meta charset="UTF-8">
</head>
<body data-ng-app="userApp" style="font-family: sans-serif;">
	<div class="container">
		<div data-ng-controller="userController">
			<h3 style="color: blue; font-family: sans-serif;">Users:</h3>
				<div class="row">
					<div class="search" id="searchText">
						<input type="text" class="form-control input-sm" maxlength="64"
							data-ng-model="globalSearch" placeholder="Search" />
						<button type="submit" class="btn btn-primary btn-sm">Search</button>
					</div>
				</div>
			<br>
			<table  class="table table-striped" border="1" style="width: 100%;">
				<tr>
					<th width="10%">Username</th>
					<th width="15%">Name</th>
					<th width="15%">Address</th>
					<th width="15%">Phone</th>
					<th width="15%">Email</th>
					<th width="10%">Status</th>
<!-- 					<th width="10%">Create Date</th> -->
<!-- 					<th width="10%">Update Date</th> -->
				</tr>
				<tr data-ng-repeat="dt in data | filter:globalSearch">
					<td>{{dt.username}}</td>
					<td>{{dt.name}}</td>
					<td>{{dt.address}}</td>
					<td>{{dt.phone}}</td>
					<td>{{dt.email}}</td>
					<td>{{dt.status}}</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>