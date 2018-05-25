var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($scope, $http) {

    $scope.abonements = [];
    $http.get('/api/Abonement').then(function (response) {
        $scope.abonements = response.data;
        console.log(response);
    });
    $scope.bans = [];
    $http.get('/api/Bans').then(function (response) {
        $scope.bans = response.data;
        console.log(response);
    });
    $scope.books = [];
    $http.get('/api/Books').then(function (response) {
        $scope.books = response.data;
        console.log(response);
    });
    $scope.booksdeliver = [];
    $http.get('/api/Booksdeliver').then(function (response) {
        $scope.booksdeliver = response.data;
        console.log(response);
    });
    $scope.booksissuance = [];
    $http.get('/api/Booksissuance').then(function (response) {
        $scope.booksissuance = response.data;
        console.log(response);
    });
    $scope.bookstatus = [];
    $http.get('/api/Bookstatus').then(function (response) {
        $scope.bookstatus = response.data;
        console.log(response);
    });
    $scope.fines = [];
    $http.get('/api/Fines').then(function (response) {
        $scope.fines = response.data;
        console.log(response);
    });
    $scope.location = [];
    $http.get('/api/Location').then(function (response) {
        $scope.location = response.data;
        console.log(response);
    });
    $scope.person = [];
    $http.get('/api/Person').then(function (response) {
        $scope.person = response.data;
        console.log(response);
    });
    $scope.persontypes = [];
    $http.get('/api/Persontypes').then(function (response) {
        $scope.persontypes = response.data;
        console.log(response);
    });
    $scope.typefine = [];
    $http.get('/api/Typefine').then(function (response) {
        $scope.typefine = response.data;
        console.log(response);
    });
    $scope.typeofabonement = [];
    $http.get('/api/Typeofabonement').then(function (response) {
        $scope.typeofabonement = response.data;
        console.log(response);
    });
    /*$scope.students = [];
    $http.get('/api/students').then(function (response) {
        //  $http.get('http://localhost:8080/api/students').then(function (response){
        $scope.students = response.data;
        //  console.log(response);
    });

    this.delchair = function del(id) {
        $http.get('/api/chair/del?id=' + id).then(function (response) {
            window.alert('Chair ' + ' ' + response.data.name + ' ' + response.data.id + ' ' + response.data.abr + ' ' + ' has been succesfully deleted!');
            window.location.reload();
        });
    };


    this.insertchair = function () {
        var id = document.getElementById("id").value;
        var name = document.getElementById("name").value;
        var abr = document.getElementById("abr").value;
        var req = {
            method: 'POST',
            url: '/api/chair/insert',
            data: {
                id: id,
                name: name,
                abr: abr
            }
        };
        console.log(req);
        $http(req).then(function (resp) {

            window.location.reload();
        })
    };
    $scope.showInsert = true;
    $scope.showUpdate = false;
    $scope.disabledId = false;
    var chair;
    this.hideInsertButton = function (item) {
        document.getElementById("id").value = item.id;
        document.getElementById("name").value = item.name;
        document.getElementById("abr").value = item.abr;
        $scope.disabledId = true;
        chair = item;
        $scope.showInsert = false;
        $scope.showUpdate = true;
    };

    this.cancelUpdate = function () {
        $scope.showInsert = true;
        $scope.showUpdate = false;
        window.location.reload();
    };

    this.updatechair = function () {
        var id = document.getElementById("id").value;
        var name = document.getElementById("name").value;
        var abr = document.getElementById("abr").value;
        var req = {
            method: 'POST',
            url: '/api/chair/update',
            data: {
                id: id,
                name: name,
                abr: abr
            }
        };
        // console.log(req);
        $http(req).then(function (resp) {

            window.location.reload();
        });

    };*/
    $scope.showInsert = true;
    $scope.showUpdate = false;
    $scope.disabledId = false;


});

