/* For this assignment you will model an object of your choosing and interest and code it in JavaScript. For example, you could code a Student, Product object,  etc… Objects we coded in class will not count.

Requirements:
Use the constructor notation to create a “template” for the object. 25 points
Create at least 2 instances of the object. 25 points
The object must have a minimum of 2 properties and 1 method. 25 points
Display the properties, values, and method(s) that result, on a web page using the textContent or InnerHTML properties.  25 points
*/

//Dating profile object constructor
function Profile(name, age, location){
    this.name = name;
    this.age = age;
    this.location = location;
    this.totalLikes = 0;
    this.like = function(){
        this.like++;
    };
    this.dislike = function(){
        this.like--;
    };
}

//Construct profile object instances
var jack = new Profile("Jack", 21, "Seattle, WA");
var jill = new Profile("Jill", 25, "Portland, OR");
var carolyn = new Profile("Carolyn", 46, "Los Angeles, CA");
var judah = new Profile("Judah", 42, "Los Angeles, CA");

//Call like() method to demonstrate its use
//Jack like() three times
jack.like();
jack.like();
jack.like();
//Jack like() two times
judah.like();
judah.like();
//Jill like() one time
jill.like();

//Call dislike() method to demonstrate its use
//Jack, Judah, Jill, and Carolyn dislike() one time each
jack.dislike();
judah.dislike();
jill.dislike();
carolyn.dislike();
