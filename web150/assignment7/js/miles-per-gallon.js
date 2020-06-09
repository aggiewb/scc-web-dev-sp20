//Disable input element so that it can be used to output miles per gallon to user
document.getElementById('miles-per-gallon').disabled = true;

//A function that calculates a user's miles per gallon according to their form inputs
//The calculated amount is then set to display in the disabled form input #miles-per-gallon
function calculateMilesPerGallon(event){
    var miles = parseInt(event.target.querySelector('#miles').value);
    var gallons = parseInt(event.target.querySelector('#gallons').value);
    event.target.querySelector('#miles-per-gallon').value = (miles / gallons).toFixed(1);
    event.preventDefault();
}

//A function that will validate whether the user has entered a valid number and provides a warning if not
//It also removes the warning when the used has entered a valid number
function validateForm(event){
    if(isNaN(event.target.value) || event.target.value === ''){
       event.target.nextElementSibling.textContent = "Please enter a valid number.";
       event.target.value = '';
    } else {
        event.target.nextElementSibling.textContent = "";
    }
}

//Add an event listener on the form element for a submit event
document.querySelector('form').addEventListener('submit', calculateMilesPerGallon);

//Add events listeners on the form user input fields for miles and gallons for a blur event
document.querySelector('#miles').addEventListener('blur', validateForm);
document.querySelector('#gallons').addEventListener('blur', validateForm);