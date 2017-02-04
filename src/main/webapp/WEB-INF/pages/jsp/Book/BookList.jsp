<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<body data-ng-app="bookApp" style="font-family: sans-serif;">
	<div class="container">
		<div data-ng-controller="bookController" data-ng-init = "listBooks()">
			<h3 style="color: blue; font-family: sans-serif;">Books:</h3>
			<div class="container">
				<div class="row">
				<div id="searchText">
						Name: <input type="text" data-ng-model="globalSearch.bookDetails.name">
						Author: <input type="text" data-ng-model="globalSearch.bookDetails.author">
						Gender: <input type="text" data-ng-model="globalSearch.bookDetails.gender">
				</div>
				</div>
			</div>
			<br>
			<table class="table table-striped" border="1" style="width: 100%;">
				<tr>
					<th width="5%">Id</th>
					<th width="10%">Code</th>
					<th width="15%">Name</th>
					<th width="10%">Author</th>
					<th width="10%">Editorial</th>
					<th width="10%">Gender</th>
					<th width="10%">Year</th>
					<th width="10%">Status</th>
<!-- 					<th width="10%">Create Date</th> -->
<!-- 					<th width="10%">Update Date</th> -->
				</tr>
				<tr data-ng-repeat= "dt in data | filter:globalSearch">
				<td>{{dt.bookId}}</td>
				<td>{{dt.bookDetails.code}}</td>
				<td>{{dt.bookDetails.name}}</td>
				<td>{{dt.bookDetails.author}}</td>
				<td>{{dt.bookDetails.editorial}}</td>
				<td>{{dt.bookDetails.gender}}</td>
				<td>{{dt.bookDetails.year}}</td>
				<td>{{dt.bookDetails.status}}</td>
				</tr>

			</table>
		</div>
	</div>
</body>
</html>
