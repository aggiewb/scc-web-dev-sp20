//Set h1 and h2 heading text content
var headingSection = document.querySelector('hgroup');
headingSection.firstElementChild.textContent = "Omnomnomnivore";
headingSection.lastElementChild.textContent = "We're Dino-mite!";

//Set h3 elements' text content
var h3Elements = document.querySelectorAll('h3');
h3Elements[0].textContent = "Hours";
h3Elements[1].textContent = "Location";

//Access hidden table for hours, by removing id attribute to display table.
var hoursTable = document.getElementById('hide');
hoursTable.removeAttribute('id');

//Get all tr elements to construct a row of th elements and a row of td elements
var tableRows = document.getElementsByTagName('tr')

//Add first row of th elements
var daysOfWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
var firstTableRow = tableRows[0];

/*For each day of the week, create a th element with a text node of a day of the week, 
and append the element to the table row. */
for(var i = 0; i < daysOfWeek.length; i++){
    var thElement = document.createElement('th');
    var thFirstContent = document.createTextNode(daysOfWeek[i]);
    thElement.appendChild(thFirstContent);
    firstTableRow.appendChild(thElement);
}

//Add second row of table data
var hours = ["11am-8pm", "11am-10pm", "8am-3pm"];
var secondTableRow = tableRows[1];

/*For each type of hour interval, create a td element with a text node of an hour interval, 
and append the element to the table row. Set the colspan of 3 to the first two rows only. */
for(var i = 0; i < hours.length; i++){
    var tdElement = document.createElement('td');
    var tdSecondContent = document.createTextNode(hours[i]);
    tdElement.appendChild(tdSecondContent);
    secondTableRow.appendChild(tdElement);
    if(i < 2){
        tdElement.setAttribute('colspan', '3');
    }
}

//Remove navbar li a elements with text content of menus, contact, and news
var navbarElement = document.getElementsByClassName('navbar');
var navbarLiElements = navbarElement[0].getElementsByTagName('li');

/*For each li element in the navbar, check to see if its child anchor tag text 
content is "Home", if not remove the li element. */
for(var i = 0; i < navbarLiElements.length; i++){
    var anchorElement = navbarLiElements[i].getElementsByTagName('a')[0];
    if(anchorElement.textContent !== "Home"){
        navbarLiElements[i].removeChild(anchorElement);
    }
}

//Set id attribute to footer element which changes font size and style
document.querySelector('footer').setAttribute('id', 'barcode');