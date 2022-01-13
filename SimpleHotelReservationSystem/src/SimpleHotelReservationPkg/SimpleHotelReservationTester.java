package SimpleHotelReservationPkg;
import java.util.Scanner;
/**
 * @author mohamed-ramdan
 * 
 * github.com/mohamed-ramdan
 * 
 * Main executor/tester class.
 */
public class SimpleHotelReservationTester {

	/**
	 * Main method 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		
		// Test the Simple Hotel Reservation System.
		// ## Create Our Hotel and rooms ##
		Room [] rooms = createRooms();
		Hotel myHotel = createHotel("Four Season", rooms);
		
		// Logging & scanning 
		final Scanner scan = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("**** Welcome to " + myHotel.getHotelName() + " Hotel ****");
		

		while(true) {
			
			System.out.println("======================================");
			System.out.println("How Can I Help You Sir: ");
			System.out.println("------------------------------");
			System.out.println("## To List all Rooms please enter:  1");
			System.out.println("## To reserve a room please enter:  2");
			System.out.println("## To display a room please enter:  3");
			System.out.println("## To Exit please enter:  0");
			String input = scan.nextLine();
			
			if("1".equals(input)) {
				System.out.println("### Hotel Rooms ### ");
				System.out.println("----------------------");
				System.out.println("---------------------------------------------");
				for(int i=0; i< myHotel.getHotelRooms().length; i++ ) {
					System.out.println("Room Number: " + myHotel.getHotelRooms()[i].getRoomNumber() + " - Price: " + myHotel.getHotelRooms()[i].getPrice() + " - Reserve Status: " + myHotel.getHotelRooms()[i].isReserved());
				}
				System.out.println("---------------------------------------------");
			}
			else if("2".equals(input)) {
				
				while(true) {
					System.out.println("Enter the room number to reserve or type n to back to the main menu");
					String roomNumToReserve = scan.nextLine();
					if("n".equals(roomNumToReserve)) {
						break;
					}
					else {
						int roomNumb = Integer.parseInt(roomNumToReserve);
						System.out.println("you chosed room number: " + roomNumb);
						roomNumb --;						
						if(myHotel.getHotelRooms()[roomNumb].isReserved()) {
							System.out.println("---------------------------------------------");
							System.out.println("Sorry the room is reserved .");
							System.out.println("---------------------------------------------");
						}
						else {
							//myHotel.getHotelRooms()[roomNumb].setReserved(true);
							Room desiredRoom = null;
							desiredRoom = myHotel.getHotelRooms()[roomNumb];
							System.out.println("---------------------------------------------");
							System.out.println("Reserving Room ......");
							myHotel.reserveRoom(desiredRoom);
							System.out.println("Room Number: " + desiredRoom.getRoomNumber() + " Reserved Successfully under the price of: " + desiredRoom.getPrice());
							System.out.println("---------------------------------------------");
							break;
						}
					}
						
				}		
				
			}
			else if ("3".equals(input)) {
				while(true) {
					System.out.println("Enter the room number to display or type n to back to the main menu");
					String roomNumToDisplay = scan.nextLine(); 
					if("n".equals(roomNumToDisplay)) {
						break;
					}else {
						int roomNumb = Integer.parseInt(roomNumToDisplay);
												
						System.out.println("you chosed room number: " + roomNumb);
						roomNumb --;	
						System.out.println("---------------------------------------------");
						System.out.println("##### Room Number: "+ myHotel.getHotelRooms()[roomNumb].getRoomNumber());
						System.out.println("##### Room Price: "+ myHotel.getHotelRooms()[roomNumb].getPrice());
						System.out.println("##### Room Type: "+ myHotel.getHotelRooms()[roomNumb].getClass().getSimpleName());
						System.out.println("##### Room Reserved: "+ myHotel.getHotelRooms()[roomNumb].isReserved());
						System.out.println("---------------------------------------------");
						
					}
				}
			}
			else if("0".equals(input)) {
				System.out.println("Good bye ...");
				break;
			}
			else {
				System.out.println("Wrong choice !!!");
			}
		}
	}

	/**
	 *  Rooms Creator helper function.
	 *  Creates statically 10 rooms the first 5 rooms single and the others double.
	 * @return Array of Room objects.
	 */
	private static Room [] createRooms() {
		Room [] rooms = new Room[10];  
		for (int i=0;i<10;i++) {
			if(i < 5) {
				rooms[i] = new SingleRoom(i+1);  
			}
			else {
				rooms[i] = new DoubleRoom(i+1);
			}
			
		}
		return rooms;
	}
	
 
	/**
	 * Hotel Creator helper function, creates hotel using given name and rooms list of rooms helper creator.
	 * @param hotelName String 
	 * @param rooms List of Room objects
	 * @return Hotel object
	 */
	private static Hotel createHotel(String hotelName, Room[] rooms) {
		Hotel hotel = new Hotel(hotelName, rooms);
		return hotel;
	}
}
