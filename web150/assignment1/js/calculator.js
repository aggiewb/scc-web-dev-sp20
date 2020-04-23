/*The following js includes the calculation of the sum of two numbers, stored in variables, 
and a display of a greeting, the calculation, and the result which is stored using a third variable.*/  
var firstInt = 5;
var secondInt = 7;
var additionCalculation = firstInt + secondInt;

var message = "Welcome to my calculator <br> The sum of " + firstInt + " + " + secondInt + " is : " + additionCalculation;
var messageElement = document.getElementById('message');
messageElement.innerHTML = message;