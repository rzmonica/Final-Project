<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="en">
<head>
<title>Users</title>
<meta charset="UTF-8">
</head>
<body style="font-family: sans-serif;">
		<div class="container">
			<form class="col-md-6" action="">
				<h2>Add User</h2>

				<div class="form-group">
					<label for="username">Username: </label> <br> <input
						class="form-control" id="username" type="text"
						placeholder="User Name...">
				</div>

				<div class="form-group">
					<label for="name">Name: </label> <br> <input
						class="form-control" id="name" type="text" placeholder="Name...">
				</div>

				<div class="form-group">
					<label for="adress">Adress: </label> <br> <input
						class="form-control" id="adress" type="text"
						placeholder="Adress...">
				</div>

				<div class="form-group">
					<label for="phone">Phone: </label> <br> <input
						class="form-control" id="phone" type="text"
						placeholder="Adress...">
				</div>

				<div class="form-group">
					<label for="email">Email: </label> <br> <input
						class="form-control" id="email" type="text" placeholder="Email...">
				</div>

				<div class="form-group">
					<label for="password">Password: </label> <br> <input
						class="form-control" id="password" type="text"
						placeholder="Password...">
				</div>

				<div class="form-group">
					<label for="status">Status: </label> <br> <select
						name="Status">
						<option value="0">- Select -</option>
						<option value="1">Active</option>
						<option value="2">Inactive</option>
					</select>
				</div>

				<button class="btn btn-primary">Send</button>
				<br> <br>
			</form>
		</div>
	</div>
</body>
</html>