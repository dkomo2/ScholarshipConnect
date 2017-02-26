var app = angular.module('frontEnd', ['ngRoute']);

app.config(function($routeProvider) {
        $routeProvider.when('/', {
                templateUrl: 'template.html',
                controller: 'scholarshipsController'
        }).otherwise({ redirectTo: '/'});
});

app.factory('scholarshipService',
        function scholarshipService($http, $q) {
                function getScholarships() {
                              return $http.get('http://localhost:3000/scholarships/').success(function(data) {
                                      service.scholarships = data;
                              });
                      }
                var service = {
                        scholarships: [],
                        getScholarships: getScholarships
                };
                return service;
        });

app.controller('scholarshipsController', function($scope, scholarshipService) {
        $scope.scholarships = function() {
                scholarshipService.getScholarships().success(function(scholarships) {
                        return scholarships;
                });
        };
        var vm = this;
        vm.scholarships = [];
        
        vm.getScholarships = function() {
                scholarshipService.getScholarships()
                .success(function(scholarships) {
                        $scope.scholarships = scholarships;
                        vm.scholarships = scholarships;
                        console.log('scholarships returned to controller', vm.scholarships);
                })
                .error(function(data) {
                        console.log('scholarships retrieval failed.');
                });
        };
        
        vm.getScholarships();
});
