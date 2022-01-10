# Arab Academy for Science and Technology and Maritime Transport
## College of Computing and Information Technology
### Simple Hotel Reservation System - OOP Lab
Implement using Java, a simple hotel reservation system with the following 4 
classes: class Room , class SingleRoom, class DoubleRoom and class Hotel, Your 
implementation should ensure encapsulation.
#### Class Room is abstract each room has:
* An integer variable roomNumber
* A boolean variable reserved representing if the room is reserved or 
not. 
* A constructor that receives the roomNumber for 
initialization of the roomNumber instance variable 
* Accessor method for instance variables. 
* Mutator method for reserved 
* An abstract method : public abstract double getPrice( )
#### Class SingleRoom which extends Room such that:
* each single room has a constructor that receives the roomNumber for 
initialization of the roomNumber instance variable 
* Implements method getPrice( ) defined in class Room by returning 
200.
#### Class DoubleRoom which extends Room such that: 
* Each double room has a constructor that receives the roomNumber 
for initialization of the roomNumber instance variable 
* Implements method getPrice( ) defined in class Room by returning 
300. 
#### Class Hotel, each hotel has: 
* A String variable name 
* A variable rooms of type: Room [ ] representing the hotel rooms 
* A constructor that receives the name , rooms for 
initialization of instance variables 
* Accessor methods for instance variables. 
* A method public boolean isFull( ) which returns true if all the hotel 
rooms are reserved, otherwise returns false. 
* A method public boolean reserveRoom(Room room) ,which if room 
is not reserved , set the reserved variable of room to true and 
returns true otherwise returns false.

### Write a test program that creates 
* 10 rooms (5 single rooms and 5 double rooms)
* A hotel with name my hotel and has 10 room which are created
* Reserve room 1,3,5,10 and 6 if not reserved
* Reserve room 1, if is already reserved then reserve room 
