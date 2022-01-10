package SimpleHotelReservationPkg;
/**
 * 
 * @author Mohamed Ramadan
 * github.com/mohamed-ramdan
 *
 * SingleRoom Class child of Abstract Room class.
 */
public class SingleRoom extends Room{

 
	/**
	 * Class Constructor
	 * @param roomNum int number to init Room Parent class instance variable.
	 */
	public SingleRoom(int roomNum) {
		super(roomNum);
	}

	// Override abstracted methods
	@Override
	public double getPrice() {
		return 200;
	}

}

