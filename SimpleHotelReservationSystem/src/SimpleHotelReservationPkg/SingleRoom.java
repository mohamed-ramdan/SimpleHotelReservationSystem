package SimpleHotelReservationPkg;

public class SingleRoom extends Room{

	// Public Constructor 
	public SingleRoom(int roomNum) {
		super(roomNum);
	}

	// Override abstracted methods
	@Override
	public double getPrice() {
		return 200;
	}

}

