function itemDone(event) {
    event.preventDefault();                                                 
    var elListItem;

    if (event.target.nodeName.toLowerCase() === "a") {  
        elListItem = event.target.parentNode;                  
    } else if (event.target.nodeName.toLowerCase() === "em") {
        elListItem = event.target.parentNode.parentNode;            
    }

    var elList = elListItem.parentNode;             
    elList.removeChild(elListItem);                        
}

var el = document.getElementById('shoppingList');
el.addEventListener('click', itemDone, false);