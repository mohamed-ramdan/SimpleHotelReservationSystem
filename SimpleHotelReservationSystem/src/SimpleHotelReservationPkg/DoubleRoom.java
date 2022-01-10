package SimpleHotelReservationPkg;
/**
 * 
 * @author Mohamed Ramadan
 * github.com/mohamed-ramdan
 *
 * DoubleRoom Class child of Abstract Room class.
 */
public class DoubleRoom extends Room{

	/**
	 * Class Constructor
	 * @param roomNum int number to init Room Parent class instance variable.
	 */
	public DoubleRoom(int roomNum) {
		super(roomNum);
		
	}

	// Override abstracted methods
	@Override
	public double getPrice() {
		return 300;
	}

}
