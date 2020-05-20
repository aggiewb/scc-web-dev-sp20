//Access hidden table for hours, and remove class name to display table.
var hidden = document.getElementsByClassName('hide');
hidden[0].className = '';

//Set h1 and h2 heading text content
var headingSection = document.querySelector('hgroup');
headingSection.firstElementChild.textContent = "Omnomnomnivore";
headingSection.lastElementChild.textContent = "We're Dino-mite!";