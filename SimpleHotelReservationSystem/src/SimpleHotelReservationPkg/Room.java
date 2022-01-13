package SimpleHotelReservationPkg;
/**
 * 
 * @author Mohamed Ramadan
 * github.com/mohamed-ramdan
 *
 * Abstract Class Room representing the Hotel's Rooms.
 */
public abstract class Room {
	// Private Attributes
	private int roomNumber;
	private boolean reserved;
	
	/**
	 * Public Constructor: initializing the instance roomNumber.
	 * @param roomNum to init private instance variable
	 */
	public Room(int roomNum) {
		this.roomNumber = roomNum;
	}

	// Public Accessors.
	/**
	 * Room Number Getter
	 * @return integer room number
	 */
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	/**
	 * reservation status checker
	 * @return true if the room is reserved, false otherwise
	 */
	public boolean isReserved() {
		return this.reserved;
	}
	
	// Mutators.
	/**
	 * reserve status setter
	 * @param reserve boolean status
	 */
	public void setReserved(boolean reserve) {
		this.reserved = reserve;
	}
	
	//  public abstract methods
	/**
	 * get price method returns the price of the room
	 * @return double price
	 */
	 public abstract double getPrice();
}
