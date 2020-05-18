var hotItems = document.querySelectorAll('li.hot'); // Store NodeList in array

 for (var i = 0; i < hotItems.length; i++) {       // Loop through each item
    hotItems[i].className = 'cool';         // Change value of class attribute
  }
