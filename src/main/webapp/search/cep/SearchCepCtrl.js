var app = angular.module('system');

app.controller('SearchCepCtrl', function($scope, $http) {
    $scope.notSearched = true;
    $scope.state = "";
    $scope.city = "";
    $scope.streetName = "";
    $scope.obj = "";
    $scope.listCep = [];

    $scope.searchCep = function() {
        var url = "http://viacep.com.br/ws/"+$scope.state+"/"+$scope.city+"/"+$scope.streetName+"/json/";
        
        $.getJSON(url, function(dadosRetorno) {
            try {
                $scope.listCep = dadosRetorno;
                $scope.notSearched = false;
                $scope.cep = "";
                $scope.$apply();
            }catch(ex) {
                
            }
        });
    }
    
    $scope.setCep = function() {
        $scope.cep = $scope.selectedNeighbourhood.cep;
    }
});