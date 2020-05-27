var elUsername = document.getElementById('username');   // Username input
var elMsg      = document.getElementById('feedback');   // Error msg element
 
// Declare function
function checkUsername(minLength) {       
  // If username too short
  if (elUsername.value.length < minLength) {            
    // Set the error message
    elMsg.innerHTML = 'Username must be ' + minLength + ' characters or more';
  } else {                                             // Otherwise
    elMsg.innerHTML = '';                              // Clear msg
  }
}
 
elUsername.addEventListener('blur', function() {        
  // When it loses focus
  checkUsername(5);                                     
  // Pass argument here
}, false);