/* For this assignment you will model an object of your choosing and interest and code it in JavaScript. 
For example, you could code a Student, Product object, etc… Objects we coded in class will not count.

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
        this.totalLikes++;
    };
    this.dislike = function(){
        this.totalLikes--;
    };
}

//Construct profile object instances
var jack = new Profile("Jack", 21, "Seattle, WA");
var jill = new Profile("Jill", 25, "Portland, OR");
var carolyn = new Profile("Carolyn", 46, "Los Angeles, CA");
var judah = new Profile("Judah", 42, "Los Angeles, CA");

//Call like() of object instance methods to demonstrate its use
//Jack like() three times
jack.like();
jack.like();
jack.like();
//Jill like() one time
jill.like();
//Jack like() two times
judah.like();
judah.like();

//Call dislike() method to demonstrate its use
//Jack, Judah, Jill, and Carolyn dislike() one time each
jack.dislike();
jill.dislike();
carolyn.dislike();
judah.dislike();

//Display name, age, and location object instance properties
//Use of innerHTML() does not have security risks due to no user input being set to innerHTML property
document.getElementById("jack").innerHTML = jack.name + ", " + jack.age + "<br>" + jack.location;
document.getElementById("jill").innerHTML = jill.name + ", " + jill.age + "<br>" + jill.location;
document.getElementById("carolyn").innerHTML = carolyn.name + ", " + carolyn.age + "<br>" + carolyn.location;
document.getElementById("judah").innerHTML = judah.name + ", " + judah.age + "<br>" + judah.location;

//Add a hobbies property
jack.hobbies = ["skating", "brewing beer", "ballet"];
jill.hobbies = ["programming JS"];
carolyn.hobbies = ["baking pastries, trying new cocktails, watching reruns of 90s sitcoms"]
judah.hobbies = ["biking", "playing guitar"];

//Display hobbies object instance property
//Use of innerHTML() does not have security risks due to no user input being set to innerHTML property
document.getElementById("jack-hobbies").innerHTML = "Hobbies: " + jack.hobbies[0] + ", " + jack.hobbies[1] + ", " + jack.hobbies[2];
document.getElementById("jill-hobbies").innerHTML = "Hobbies: " +  jill.hobbies[0];
document.getElementById("carolyn-hobbies").innerHTML = "Hobbies: " +  carolyn.hobbies[0], + ", " + carolyn.hobbies[1] + ", " + carolyn.hobbies[2];
document.getElementById("judah-hobbies").innerHTML = "Hobbies: " +  judah.hobbies[0] + ", " + judah.hobbies[1];

//Display totalLikes hobbies object instance property
document.getElementById("jack-likes").textContent = "Total Likes: " + jack.totalLikes;
document.getElementById("jill-likes").textContent = "Total Likes: " + jill.totalLikes;
document.getElementById("carolyn-likes").textContent = "Total Likes: " + carolyn.totalLikes;
document.getElementById("judah-likes").textContent = "Total Likes: " + judah.totalLikes;

