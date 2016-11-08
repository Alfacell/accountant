
var app = angular.module('app',["ngRoute"])
    .config(function ($routeProvider,$locationProvider){
    $locationProvider.html5Mode(true);

$routeProvider.
    when("/",{templateUrl:"/html/main.html",controller:"mainController"})

    when("/1",{templateUrl:"/html/mainCommon.html",controller:"mainCommonController"})

    
})
.controller("mainController",function($scope) {
})
    .controller("mainCommonController",function($scope) {
    })