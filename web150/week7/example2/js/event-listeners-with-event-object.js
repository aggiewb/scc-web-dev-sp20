function checkLength(event, minLength) {         // Declare function
    var el, elMsg;                             // Declare variables
    if (!event) {                                  // If event object doesn't exist
    event = window.event;                        // Use IE fallback
    }
    el = event.target || event.srcElement;             // Get target of event
    elMsg = el.nextSibling;                    // Get its next sibling
   
    if (el.value.length < minLength) {         // If length is too short set msg
      elMsg.innerHTML = 'Username must be ' + minLength + ' characters or more';
    } else {                                   // Otherwise
      elMsg.innerHTML = '';                    // Clear message
    }
  }
   
  var elUsername = document.getElementById('username');// Get username input
  if (elUsername.addEventListener) {           // If event listener supported
    elUsername.addEventListener('blur', function(event) {  // On blur event
      // NOTE: This function is checkLength() - not checkUsername()
      checkLength(event, 5);                             // Call checkLength()
    }, false);                                       // Capture in bubble phase
  } else {                                           // Otherwise
    elUsername.attachEvent('onblur', function(event) {   // IE fallback onblur
      // NOTE: This function is checkLength() - not checkUsername()
      checkLength(event, 5);                             // Call checkLength()
    });
  }
  