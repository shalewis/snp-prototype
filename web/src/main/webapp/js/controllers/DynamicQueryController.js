'use strict';

/* Controllers */

app.controller('DynamicQueryController', ['$scope', 'dynamicQueryFactory',
  function($scope, dynamicQueryFactory) {
    // create a blank object to hold our form information
	// $scope will allow this to pass between controller and view
    $scope.formData = {};
    $scope.formData.observation = null;
    $scope.formData.provenance = null;
    $scope.formData.timing = null;
    $scope.formData.value = null;
    $scope.patients = {};
	
    $scope.processForm = function() {
    	$scope.formData.filter = 'observation=' + $scope.formData.observation + 
    	',provenance=' + $scope.formData.provenance + ',value=' + $scope.formData.value;
    	
    	dynamicQueryFactory.getPatients($scope.formData)
            .success(function (data, status, headers, config) {
            	$scope.status = status;
                $scope.patients = data.results;
            })
            .error(function (data, status, headers, config) {
                $scope.status = 'Unable to load patient data: ' + status;
            });
    };
}]);