var app = angular.module('system');

app.controller('CreateClientCtrl', function($scope, $http) {
	$scope.tab = 1;
	
	$scope.person = {};
	
	$scope.selectTab = function(number) {
		$scope.tab = number;
	}
	
	$scope.selected = function(number) {
		return number === $scope.tab;
	}
	
	$scope.register = function(person) {
		$http.post('client/create', person);
	}
});