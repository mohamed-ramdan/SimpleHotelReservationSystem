package SimpleHotelReservationPkg;
/**
 * 
 * @author Mohamed Ramadan
 * github.com/mohamed-ramdan
 *
 * Hotel Class representing the Hotel entity.
 */
public class Hotel {
	private String hotelName;
	private Room rooms[];
	
	/**
	 * Public Constructor.
	 * @param hName String hotel name
	 * @param hRooms Array Room objects
	 */
	public Hotel(String hName, Room hRooms[]) {
		this.hotelName = hName;
		this.rooms = hRooms;
	}

	// Public Accessors.
	public String getHotelName() {
		return this.hotelName;
	}
	
	public Room [] getHotelRooms() {
		return this.rooms;
	}
	
	/**
	 * isFull method checks if all Hotel's rooms are reserved.
	 * loops on all rooms, if one room at least is not reserved then break.
	 * @return Boolean true if all rooms were reserved, false otherwise. 
	 */
	public boolean isFull() {
		boolean result = true;
		for(int i=0; i< this.rooms.length;i++) {
			if(!this.rooms[i].isReserved()) { // similar to this -->  this.rooms[i].isReserved() == false
				result = false;
				break;
			}
		}
		return result;
	}
	

	/**
	 * reserveRoom method checks if a given room is not reserved to reserve.
	 * loop on all hotel rooms, check the rooms using given room number then reservation status.
	 * if not reserved , set reserved true, return false otherwise. 
	 * @param room Room object 
	 * @return Boolean true if reserved, false otherwise.
	 */
	public boolean reserveRoom(Room room) {
		boolean result = false;
		for(int i=0; i< this.rooms.length;i++) {
			if(room.getRoomNumber() == this.rooms[i].getRoomNumber()) {
				if(!this.rooms[i].isReserved()) { // similar to this -->  this.rooms[i].isReserved() == false
					this.rooms[i].setReserved(true);
					result = true;
					break;
				}
			}
		}
		return result;
	}
}
