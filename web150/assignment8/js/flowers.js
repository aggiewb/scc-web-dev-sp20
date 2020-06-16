//This assignment demonstrates the use of a few jQuery effects and an interaction.

//A function that creates new p element to prependTo() the body and then show() after h1 and p tag user instructions have fadedOut().
function transition(){
    $("#flowers").off("mousedown");

    //The third argument in fadeOut() is a complete parameter, which is 
    //a function to call once the animation is complete, called once per matched element.
    $("h1").fadeOut(3000, "linear", function(){
        $("button").show(3000, "linear");
    });
    $("p").fadeOut(3000, "linear");
    
    $("#copyright").show(8000, "linear");
}

//A function that resets the top and left coordinate back to their original 0, 0 location within the #flowers div
function resetFlowers(){
    $("button").on("click", function() {
        $("img").each(function(){
            this.style.top = 0;
            this.style.left = 0;
        })
    });
}

//A function that creates/hides html elements to later show during transition()
function elementsToHide(){
    var $newPElement = $('<p id="copyright">Aggie Wheeler Bateman &copy 2020 <a href="https://www.aggiewheelerbateman.com" target="_blank">Personal Portfolio</a></p>');
    var $buttonElement = $("button");
    
    $buttonElement.button();
    $buttonElement.hide().button();
    $newPElement.hide().prependTo($("body"));
}



//Add draggable() functionality to all images
$("img").draggable();
elementsToHide();
$("#flowers").on("mousedown", transition);
resetFlowers();