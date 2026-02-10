package inner_class.local_inner_class;

public class Guest {
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel("ITC Royal Bengal", "Salt Lake, Kolkata", 400, 100);
		
		hotel.hotelInfo();
		hotel.availableRoom();
		hotel.reserveRoom("Abhishek", 1);
		hotel.availableRoom();
	}
}
