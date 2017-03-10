angular.module('system', [

     "ngRoute",
     "ui.mask"
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
     .when('/search/cep', {
         templateUrl: 'search/cep/searchCep.html',
         controller: 'SearchCepCtrl'
     })
     .otherwise({redirectTo:'/'});
}]);