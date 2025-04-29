var app = angular.module('courseApp', []);

app.controller('CourseController', function($scope, $http) {
    $scope.enrolledCourses = [];

    // Fetch courses from Spring Boot API
    $http.get("http://localhost:8081/api/courses").then(function(response) {
        $scope.courses = response.data;
    }).catch(function(error) {
        console.error("Error fetching courses:", error);
    });

    $scope.enroll = function(course) {
        if (!$scope.isEnrolled(course)) {
            $scope.enrolledCourses.push(course);
        }
    };

    $scope.unenroll = function(course) {
        $scope.enrolledCourses = $scope.enrolledCourses.filter(c => c !== course);
    };

    $scope.isEnrolled = function(course) {
        return $scope.enrolledCourses.includes(course);
    };
});