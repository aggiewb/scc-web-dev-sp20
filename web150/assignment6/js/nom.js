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