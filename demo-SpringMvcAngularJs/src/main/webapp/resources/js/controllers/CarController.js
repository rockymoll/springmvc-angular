'use strict';

/**
 * CarController
 * @constructor
 */
var CarController = function($scope, $http) {
	
	$scope.car = {};
    $scope.editMode = false;
	
    $scope.fetchCarsList = function() {
        $http.get('cars/carlist.json').success(function(carList){
             $scope.cars = carList;
         });
    };

    $scope.addNewCar = function(newCar) {
    	alert(newCar.fichier);
        $http.post('cars/addCar', newCar).success(function() {
        	$scope.fetchCarsList();
            $scope.car.name = '';
            $scope.car.color = '';
            $scope.car.fichier = '';
        }).error(function() {
            $scope.setError('Could not add a new car');
        });
    };

    $scope.removeCar = function(car) {
        $http.delete('cars/removeCar/' + car).success(function() {
            $scope.fetchCarsList();
        });
    };

    $scope.removeAllCars = function() {
        $http.delete('cars/removeAllCars').success(function() {
            $scope.fetchCarsList();
        });

    };

    $scope.fetchCarsList();
    
    $scope.query = 'name';
    
    $scope.myCar = {};
    
    $scope.fichier = "";
    
};