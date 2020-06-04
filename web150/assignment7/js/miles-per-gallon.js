//Disable input element so that it can be used to output miles per gallons to user
document.getElementById('miles-per-gallon').disabled = true;

//Add a function that calculates a user's miles per gallon according to their form inputs
function calculateMilesPerGallon(event){
    var miles = event.target.querySelector('#miles').value;
    var gallons = event.target.querySelector('#gallons').value;
    event.target.querySelector('#miles-per-gallon').value = miles / gallons;
    event.preventDefault();
}

//Add an event listener on the form element for a submit event
document.querySelector('form').addEventListener('submit', calculateMilesPerGallon, false);