angular.module('system', [
       
     // Angular
     "ngRoute",
                           
])

.config(['$routeProvider', function($routeProvider){
     $routeProvider
     .when('/',{template:'index.html'})
     .when('/create/client',{
    	 templateUrl:'create/client/createClientTemplate.html',
    	 controller: 'CreateClientCtrl',
     })
     .when('/create/vehicle', {
    	 templateUrl: 'create/vehicle/createVehicleTemplate.html',
    	 controller: 'CreateVehicleCtrl'
     })
     .when('/create/brand', {
    	 templateUrl: 'create/brand/createBrandTemplate.html',
    	 controller: 'CreateBrandCtrl'
     })
     .when('/create/model', {
    	 templateUrl: 'create/model/createModelTemplate.html',
    	 controller: 'CreateModelCtrl'
     })     
     .otherwise({redirectTo:'/'});
}]);