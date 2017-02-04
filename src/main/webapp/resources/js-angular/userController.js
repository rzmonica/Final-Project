var application = angular.module("userApp", []);
application.controller("userController", [ "$scope", "$http",
		function($scope, $http) {
			$scope.list = {};
	
			$scope.dataBase = function() {
				$http.get("http://localhost:8080/finalproject/user/userList") 
				.success(function(response) {
					$scope.data = response;
				}).error(function() {
					$scope.data = "error in fetching data";
				});
			}
		

		} ])