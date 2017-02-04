var application = angular.module("orderApp", []);
application.controller("orderController", [ "$scope", "$http",
		function($scope, $http) {
			$scope.list = {};
	
			$scope.dataBase = function() {
				$http.get("http://localhost:8080/finalproject/order/orderList") 
				.success(function(response) {
					$scope.data = response;
				}).error(function() {
					$scope.data = "error in fetching data";
				});
			}
			
			$scope.dataBase();

		} ])