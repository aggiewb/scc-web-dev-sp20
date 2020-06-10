//This assignment demonstrates the use of a few jQuery effects and an interaction.

//A function that creates new p element to prependTo() the body and then show() after h1 and p tag user instructions have fadedOut().
function intro(){
    var $newPElement = $('<p>Aggie Wheeler Bateman &copy 2020 <a href="https://www.aggiewheelerbateman.com" target="_blank">Personal Portfolio</a></p>');
    $newPElement.hide().prependTo($("body"));
    $("h1, p").fadeOut(8000, "linear");
    $newPElement.show(15000, "linear");
}

//Add draggable() functionality to all images
$("img").draggable();

intro();

