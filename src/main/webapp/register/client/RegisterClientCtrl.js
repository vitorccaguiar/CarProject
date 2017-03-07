var app = angular.module('system');

app.controller('RegisterClientCtrl', function($scope, $http) {
    $scope.tab = 1;

    $scope.client = {};
    $scope.addresses = [];
    $scope.contacts = [];
    $scope.requiredBankAccount = {};
    $scope.extraBankAccounts = [];
    $scope.bankAccounts = $scope.extraBankAccounts.unshift($scope.requiredBankAccount);
    
    $scope.selectTab = function(number) {
        $scope.tab = number;
        for (var i = 1; i <= 5; i++) {
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
        $scope.bankAccounts.push({});
    }
    
    $scope.removeBankAccount = function(index) {
        $scope.bankAccounts.splice(index, 1);
    }

    $scope.searchCep = function(index) {
        var cep = $scope.addresses[index].cep;
        var url = "http://viacep.com.br/ws/"+cep+"/json/";
        
        if (cep === "") {
            $scope.addresses[index].state = "";
            $scope.addresses[index].city = "";
            $scope.addresses[index].neighbourhood = "";
            $scope.addresses[index].streetName = "";
        }

        $.getJSON(url, function(dadosRetorno) {
            try {
                $scope.addresses[index].state = dadosRetorno.uf;
                $scope.addresses[index].city = dadosRetorno.localidade;
                $scope.addresses[index].neighbourhood = dadosRetorno.bairro;
                $scope.addresses[index].streetName = dadosRetorno.logradouro;
                $scope.$apply();
            }catch(ex) {

            }
        });
    };
    
    $scope.register = function(client) {
        $http.post('client/create', client);
    }
});