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
    
    $scope.searchCep = function() {
        $http.post('client/search/cep', client);
    };
    
    $scope.consulta = function() {
        var cep = document.getElementById("inputCep").value;
        cep = cep.replace(/[^0-9]/, "");
        var url = "http://viacep.com.br/ws/"+cep+"/json/";
        
        if (cep === "") {
            document.getElementById("inputRua").value = "";
            document.getElementById("inputNeighbourhood").value = "";
            document.getElementById("inputCity").value = "";
            document.getElementById("inputState").value = "";
        }
        $.getJSON(url, function(dadosRetorno){
            try{
            // Insere os dados em cada campo
            document.getElementById("inputRua").value = dadosRetorno.logradouro;
            document.getElementById("inputNeighbourhood").value = dadosRetorno.bairro;
            document.getElementById("inputCity").value = dadosRetorno.localidade;
            document.getElementById("inputState").value = dadosRetorno.uf;
            }catch(ex){}
            
        });
    }
});