var application = angular.module("bookApp", []);
application.controller("bookController",  [ "$scope", "$http",
		function($scope, $http, $q, $window) {
			$scope.book = {};
			
			$scope.listBooks = function() {
				$http.get("http://localhost:8080/finalproject/book/bookList") 
				.success(function(response) {
					$scope.data = response;
				}).error(function() {
					$scope.data = "error in fetching data";
				});
				}
			
			$scope.addBook = function(book){
				var deferred = $q.defer(); 
				$http.post("http://localhost:8080/finalproject/book/createBook", book)
				.then(function(response){
					deferred.resolver(reponse.data)	
					window.location = "http://localhost:8080/finalproject/book/list";
					console.log("success");
					alert(hola);
					}).error(function(){
						deferred.reject(errorRes)
						window.location = "http://localhost:8080/finalproject/book/create";
						alert("Error, please try again");
				}
					);
			
			}
}]);
