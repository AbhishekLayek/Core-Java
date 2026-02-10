package inner_class.local_inner_class;

public class Hotel {
	
	private String name;
	private String address;
	private int totalRooms;
	private int resrvedRooms;
	
	public Hotel(String name, String address, int totalRooms, int resrvedRooms) {
		super();
		this.name = name;
		this.address = address;
		this.totalRooms = totalRooms;
		this.resrvedRooms = resrvedRooms;
	}
	
	public void hotelInfo() {
		System.out.println("Hotel Name: " + name + "\nAddress: " + address + "\nTotal Rooms: " + totalRooms);
	}
	
	public void availableRoom() {
		System.out.println("Available Room: " + (totalRooms - resrvedRooms));
	}
	
	public void reserveRoom(String guestName, int noOfRooms) {
		
		// Local Inner Class
		class ReservationValidator{
			
			boolean validate() {
				if(guestName == null || guestName.isBlank()) {
					System.out.println("Guest Name Can Not Be Empty");
					return false;
				}
				if(noOfRooms < 0) {
					System.out.println("Number Of Rooms Cannot Be Empty");
					return false;
				}
				if(resrvedRooms + noOfRooms > totalRooms) {
					System.out.println("Not Enough Room Available");
					return false;
				}
				return true;
			}
		}
		
		ReservationValidator validator = new ReservationValidator();
		
		if(validator.validate()) {
			resrvedRooms += noOfRooms;
			System.out.println("Reservation Confirmed For The Guest " + guestName + " For " + noOfRooms);
		}
		else {
			System.out.println("Reservation Failed!");
		}
	}
}
