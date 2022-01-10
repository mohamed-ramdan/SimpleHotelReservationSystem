package SimpleHotelReservationPkg;

public class DoubleRoom extends Room{

	// Public Constructor 
	public DoubleRoom(int roomNum) {
		super(roomNum);
		
	}

	// Override abstracted methods
	@Override
	public double getPrice() {
		return 300;
	}

}
