// Create the template for objects that are hotels
function Hotel(name, rooms, booked) {
    this.name = name;
    this.rooms = rooms;
    this.booked = booked;
    this.checkAvailability = function() {
      return this.rooms - this.booked;
    };
  }
  
  
  // Create two hotel objects
  var quayHotel = new Hotel('Quay', 40, 25);
  var parkHotel = new Hotel('Park', 120, 77);