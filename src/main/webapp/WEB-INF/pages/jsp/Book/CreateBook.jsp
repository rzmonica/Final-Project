<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<body data-ng-app="bookApp">
	<div class="container" >
		<form class="col-md-6" action="" data-ng-controller="bookController">
			<h2>Add Book</h2>

			<div class="form-group">
				<label for="code">Code: </label> <br> <input
					class="form-control" id="code" type="text" placeholder="Code..."
					data-ng-model=book.bookDetails.code>
			</div>

			<div class="form-group">
				<label for="name">Name: </label> <br> <input
					class="form-control" id="name" type="text" placeholder="Name..."
					data-ng-model=book.bookDetails.name>
			</div>

			<div class="form-group">
				<label for="author">Author: </label> <br> <input
					class="form-control" id="author" type="text"
					placeholder="Author..." data-ng-model=book.bookDetails.author>
			</div>

			<div class="form-group">
				<label for="editorial">Editorial: </label> <br> <input
					class="form-control" id="editorial" type="text"
					placeholder="Editorial..." data-ng-model=book.bookDetails.editorial>
			</div>

			<div class="form-group">
				<label for="gender">Gender: </label> <br> <input
					class="form-control" id="gender" type="text"
					placeholder="Gender..." data-ng-model=book.bookDetails.gender>
			</div>

			<div class="form-group">
				<label for="year">Year: </label> <br> <input
					class="form-control" id="year" type="number" placeholder="Year..."
					data-ng-model=book.bookDetails.year>
			</div>

<!-- 			<div class="form-group"> -->
<!-- 				<label for="status" >Status: -->
<!-- 				</label> <br> <select name="Status" data-ng-model=book.bookDetails.status> -->
<!-- 					<option value="0">Select</option> -->
<!-- 					<option value="1">Available</option> -->
<!-- 				</select> -->
<!-- 			</div> -->

			<div>
				<button class="btn btn-primary" data-ng-click="addBook(book)">Add
					Book</button>
			</div>
			{{book}}
		</form>
	</div>
</body>