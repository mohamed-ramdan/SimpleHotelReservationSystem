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
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public boolean isReserved() {
		return this.reserved;
	}
	
	// Mutators.
	public void setReserved(boolean reserve) {
		this.reserved = reserve;
	}
	
	//  public abstract methods
	 public abstract double getPrice();
}
