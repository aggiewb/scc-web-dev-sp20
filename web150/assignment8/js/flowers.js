function intro(){
    var $newPElement = $('<p>Aggie Wheeler Bateman &copy 2020 <a href="https://www.aggiewheelerbateman.com" target="_blank">Personal Portfolio</a></p>');
    $newPElement.hide().prependTo($("body"));
    $newPElement.show(15000, "linear");
    $("h1, p").fadeOut(8000, "linear");
}

$("img").draggable();
intro();
