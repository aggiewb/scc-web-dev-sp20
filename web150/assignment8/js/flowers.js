function intro(){
    var $newPElement = $('<p>Aggie Wheeler Bateman &copy 2020 <a href="https://www.aggiewheelerbateman.com" target="_blank">Personal Portfolio</a></p>');
    $("h1").fadeOut(8000, "linear");
    $("p").fadeOut(8000, "linear");
    $newPElement.hide().prependTo($("body"));
    $newPElement.show(15000, "linear");
}

$("img").draggable();
intro();
