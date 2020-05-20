//Access hidden table for hours, and remove class name to display table.
var hidden = document.getElementsByClassName('hide');
hidden[0].className = '';

//Set h1 and h2 heading text content
var headingSection = document.querySelector('hgroup');
headingSection.firstElementChild.textContent = "Omnomnomnivore";
headingSection.lastElementChild.textContent = "We're Dino-mite!";

//Set h3 elements' text content
var h3Elements = document.querySelectorAll('h3');
for(var i = 0; i < h3Elements.length; i++){
    if(i === 0){
        h3Elements[0].textContent = "Hours";
    } else if(i === 1){
        h3Elements[1].textContent = "Location";
    }
}

//Get all tr element children of h3 "Hours" element to construct td elements
var tableRows = document.getElementsByTagName('tr')
var tdElement;

//Add first row of table data
var daysOfWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
var firstTableRow = tableRows[0];
for(var i = 0; i < daysOfWeek.length; i++){
    tdElement = document.createElement('td');
    var tdFirstContent = document.createTextNode(daysOfWeek[i]);
    tdElement.appendChild(tdFirstContent);
    firstTableRow.appendChild(tdElement);
}

//Add second row of table data
var hours = ["11am-8pm", "11am-10pm", "8am-3pm"];
var secondTableRow = tableRows[1];
for(var i = 0; i < hours.length; i++){
    tdElement = document.createElement('td');
    var tdSecondContent = document.createTextNode(hours[i]);
    tdElement.appendChild(tdSecondContent);
    secondTableRow.appendChild(tdElement);
    if(i < 2){
        tdElement.setAttribute('colspan', '3');
    }
}

//Remove navbar children li with a tag elements, menus, contact, and news
var navbarElement = document.getElementsByClassName('navbar');
var navbarLiElements = navbar[0].getElementsByTagName('li');

//For each li element in the navbar, check to see if its child anchor tag text 
//content is "Home", if not remove the li element.
for(var i = 0; i < navbarLiElements.length; i++){
    var anchorElement = navbarLiElements[i].getElementsByTagName('a')[0];
    if(anchorElement.textContent !== "Home"){
        navbarLiElements[i].removeChild(anchorElement);
    }
}