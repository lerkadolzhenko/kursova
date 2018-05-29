var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope) {

    $scope.typeofabonement = [];
    $http.get('/api/typeofabonement').then(function (response) {
        $scope.typeofabonement = response.data;
        console.log(response);
    });
    this.insert = function add() {
        var nametypeofabonement = document.getElementById("TypeName").value;

        var errorMessage='Помилка: неправильні вхідні дані!\n';
        var isValid=true;
        var regex = /^[А-Яа-яІі]+$/;
        if(!regex.test(nametypeofabonement)){
            errorMessage=errorMessage+'-невірний формат назви типу абонемента;\n';
            isValid=false;
        }
        if(isValid){
            var req = {
                method: 'POST',
                url: '/api/typeofabonement/insert',
                data: {
                    nametypeofabonement: nametypeofabonement
                }
            };
            console.log(req);
            $http(req).then(function (resp) {
                console.log(resp);
                window.location.reload();
            });
        }
        else window.alert(errorMessage);
    };

    this.startUpdate = function startUpdate(idtypeofabonement,nametypeofabonement) {
        document.getElementById("IdUPD").innerText = idtypeofabonement;
        document.getElementById("NameUPD").value = nametypeofabonement;
    };

    this.update = function update() {
        var idtypeofabonement = document.getElementById("IdUPD").innerText;
        var nametypeofabonement = document.getElementById("NameUPD").value;
        var req = {
            method: 'POST',
            url: '/api/typeofabonement/update?id=' + idtypeofabonement,
            data: {
                nametypeofabonement: nametypeofabonement
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.del = function del(id) {
        console.log(id);
        $http.get('/api/typeofabonement/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});