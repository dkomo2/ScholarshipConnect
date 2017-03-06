var app = angular.module('frontEnd', ['ngRoute']);

app.config(function($routeProvider) {
        $routeProvider.when('/', {
                templateUrl: 'template.html',
                controller: 'scholarshipsController'
        }).otherwise({ redirectTo: '/'});
});

app.factory('scholarshipConnectService',
        function scholarshipConnectService($http, $q) {
                function getScholarships() {
                        return $http.get('http://localhost:3000/scholarships/').success(function(data) {
                                service.scholarships = data;
                        });
                }
                function getAcademicPrograms() {
                        return $http.get('http://localhost:3000/academicPrograms').success(function(data) {
                                service.academicPrograms = data;
                        });
                }
                function getSchoolRanks() {
                        return $http.get('http://localhost:3000/schoolRanks').success(function(data) {
                                service.schoolRanks = data;
                        });
                }
                var service = {
                        scholarships: [],
                        academicPrograms: [],
                        schoolRanks: [],
                        getScholarships: getScholarships,
                        getAcademicPrograms: getAcademicPrograms,
                        getSchoolRanks: getSchoolRanks
                };
                return service;
        });

app.controller('scholarshipsController', function($scope, scholarshipConnectService) {
        this.getScholarships = function() {
                scholarshipConnectService.getScholarships()
                .success(function(scholarships) {
                        $scope.scholarships = scholarships;
                        console.log('scholarships returned to controller', scholarships);
                })
                .error(function(data) {
                        console.log('scholarships retrieval failed.');
                });
        };
        this.getAcademicPrograms = function() {
                scholarshipConnectService.getAcademicPrograms()
                .success(function(academicPrograms) {
                        $scope.academicPrograms = academicPrograms;
                        console.log('academicPrograms returned to controller', academicPrograms);
                })
                .error(function(data) {
                        console.log('academicPrograms retrieval failed.');
                });
        };
        this.getSchoolRanks = function() {
                scholarshipConnectService.getSchoolRanks()
                .success(function(schoolRanks) {
                        $scope.schoolRanks = schoolRanks;
                        console.log('schoolRanks returned to controller', schoolRanks);
                })
                .error(function(data) {
                        console.log('schoolRanks retrieval failed.');
                });
        };
        
        this.getScholarships();
        this.getAcademicPrograms();
        this.getSchoolRanks();
});
