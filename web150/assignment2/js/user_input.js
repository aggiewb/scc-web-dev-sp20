/* Code a program that accepts user input for the name as well as two numbers to add. 
Hint: Use prompt to get user input. You will need to store the user input in variables. 
Prompt returns a string, so you will need to convert the numbers to integers using ParseInt. */

//Program description, user prompts, and input of user information
var userName = window.prompt("Let's play the sum game. \n Please enter your name");
var userFirstNum = window.prompt("Enter first number");
var userSecondNum = window.prompt("Enter second number");

//Output of user information to html element
var sumGameMessage = document.getElementById("sum-game-message");
var userSum = parseInt(userFirstNum, 10) + parseInt(userSecondNum, 10);

sumGameMessage.textContent = "Hi " + userName + "! The sum of " + userFirstNum + " + " + userSecondNum + " is " + userSum;




