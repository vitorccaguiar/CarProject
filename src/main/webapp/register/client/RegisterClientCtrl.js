var app = angular.module('system');

app.controller('RegisterClientCtrl', function($scope, $http) {
    $scope.tab = 1;

    $scope.client = {};
    $scope.requiredBankAccount = {};
    $scope.extraBankAccounts = [];
    $scope.requiredReference = {};
    $scope.extraReferences = [];
    //$scope.references = $scope.extraReferences.unshift($scope.requiredReference);
    //$scope.bankAccounts = $scope.extraBankAccounts.unshift($scope.requiredBankAccount);
    
    $scope.selectTab = function(number) {
        $scope.tab = number;
        for (var i = 1; i <= 6; i++) {
            if (i != number) {
                $("#" + i).removeClass("active");
            }
        }
        $("#" + number).addClass("active");
    }

    $scope.selected = function(number) {
        return number === $scope.tab;
    }
    
    $scope.addBankAccount = function() {
        $scope.extraBankAccounts.push({});
    }
    
    $scope.removeBankAccount = function(index) {
        $scope.extraBankAccounts.splice(index, 1);
    }

    $scope.addReference = function() {
        $scope.extraReferences.push({});
    }
    
    $scope.removeReference = function(index) {
        $scope.extraReferences.splice(index, 1);
    }

    $scope.searchCep = function(index) {
        var cep = $scope.client.addresses[index].cep;
        var url = "http://viacep.com.br/ws/"+cep+"/json/";

        $.getJSON(url, function(dadosRetorno) {
            try {
                if (dadosRetorno.erro == true) {
                    window.alert("CEP não encontrado!");
                    $scope.clearCepFields(index);
                }else {
                    $scope.client.addresses[index].state = dadosRetorno.uf;
                    $scope.client.addresses[index].city = dadosRetorno.localidade;
                    $scope.client.addresses[index].neighbourhood = dadosRetorno.bairro;
                    $scope.client.addresses[index].streetName = dadosRetorno.logradouro;
                    $scope.$apply();
                }
            }catch(ex) {
                console.log(ex);
            }
        });
    };
    
    $scope.clearCepFields = function(index) {
        $scope.client.addresses[index].state = "";
        $scope.client.addresses[index].city = "";
        $scope.client.addresses[index].neighbourhood = "";
        $scope.client.addresses[index].streetName = "";
        $scope.$apply();
    }
    
    $scope.register = function() {
        $http.post('client/create', client);
    }
});