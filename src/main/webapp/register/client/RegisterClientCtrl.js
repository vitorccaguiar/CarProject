var app = angular.module('system');

app.controller('RegisterClientCtrl', function($scope, $http) {
    $scope.tab = 1;

    $scope.client = {};
    $scope.address = [];
    
    $scope.selectTab = function(number) {
        $scope.tab = number;
    }

    $scope.selected = function(number) {
        return number === $scope.tab;
    }

    $scope.register = function(client) {
        $http.post('client/create', client);
    }

    $scope.searchCep = function(type) {
        if (type === "home") {
            var idCep = "#inputHomeCep";
            var street = "#inputHomeStreetName";
            var neighbourhood = "#inputHomeNeighbourhood";
            var city = "#inputHomeCity";
            var uf = "#inputHomeState";
        }else {
            var idCep = "#inputBusinessCep";
            var street = "#inputBusinessStreetName";
            var neighbourhood = "#inputBusinessNeighbourhood";
            var city = "#inputBusinessCity";
            var uf = "#inputBusinessState";
        }

        var cep = $(idCep).val();
        var url = "http://viacep.com.br/ws/"+cep+"/json/";
        
        if (cep === "") {
            $(rua).val("");
            $(neighbourhood).val("");
            $(city).val("");
            $(uf).val("");
        }

        $.getJSON(url, function(dadosRetorno) {
            try {
                $(street).val(dadosRetorno.logradouro);
                $(neighbourhood).val(dadosRetorno.bairro);
                $(city).val(dadosRetorno.localidade);
                $(uf).val(dadosRetorno.uf);
            }catch(ex) {

            }
        });
    };
});