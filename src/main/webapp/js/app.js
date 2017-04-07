(function(){
    const app = angular.module('carApp',[]);

    app.controller('carCtrl', function($scope, $http){
        $scope.cars = [];
        $scope.oneCar = {};
        $scope.makeGet = function () {
            $http({
                method : 'GET',
                url: 'http://localhost:8090/cars'
            }).then(function(success){
                $scope.cars = success.data;
            })
        };
        $scope.addCar = function (thisCar) {
            console.log(thisCar);
            $http({
                method : 'GET',
                url : 'http://localhost:8090/newcar',
                params : {
                    mod : thisCar.model,
                    col : thisCar.color,
                    year : thisCar.creationDate,
                    cond : thisCar.conditioner,
                    count : thisCar.country
                }
            }).then(function (success) {
            });
        };
        $scope.makeGet();
    });
})();