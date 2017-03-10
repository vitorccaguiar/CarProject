var app = angular.module('system');

app.controller('RegisterClientCtrl', function($scope, $http) {
    $scope.type = "CPF";
    $scope.registerMask = "999.999.999-99";
    $scope.client = {};
    $scope.requiredBankAccount = {};
    $scope.extraBankAccounts = [];
    $scope.requiredReference = {};
    $scope.extraReferences = [];
    //$scope.references = $scope.extraReferences.unshift($scope.requiredReference);
    //$scope.bankAccounts = $scope.extraBankAccounts.unshift($scope.requiredBankAccount);
    
    $scope.nextTab = function() {
        $(".nav-tabs > .active").next("li").find("a").trigger("click");
    }
    
    $scope.previousTab = function() {
        $(".nav-tabs > .active").prev("li").find("a").trigger("click");
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
    
    $scope.changeType = function(type) {
        $scope.type = type;
        $scope.client.register = "";
        if (type === "CPF") {
            $scope.registerMask = "999.999.999-99";
        }
        if (type === "CNPJ") {
            $scope.registerMask = "99.999.999/9999-99";
        }
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