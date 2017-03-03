angular.module('system', [

     // Angular
     "ngRoute",
     "ngMask"
])

.config(['$routeProvider', function($routeProvider){
     $routeProvider
     .when('/',{template:'index.html'})
     .when('/register/client',{
         templateUrl:'register/client/registerClientTemplate.html',
         controller: 'RegisterClientCtrl',
     })
     .when('/register/vehicle', {
         templateUrl: 'register/vehicle/registerVehicleTemplate.html',
         controller: 'RegisterVehicleCtrl'
     })
     .otherwise({redirectTo:'/'});
}]);