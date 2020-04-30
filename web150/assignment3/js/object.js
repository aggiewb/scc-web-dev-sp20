/* For this assignment you will model an object of your choosing and interest and code it in JavaScript. For example, you could code a Student, Product object,  etc… Objects we coded in class will not count.

Requirements:
Use the constructor notation to create a “template” for the object. 25 points
Create at least 2 instances of the object. 25 points
The object must have a minimum of 2 properties and 1 method. 25 points
Display the properties, values, and method(s) that result, on a web page using the textContent or InnerHTML properties.  25 points
*/

//Profile object constructor
function Profile(name, age, location){
    this.name = name;
    this.age = age;
    this.location = location;
    this.totalLikes = 0;
    this.like = function(){
        this.like++;
    }
    this.dislike = function(){
        this.like--;
    }
}
