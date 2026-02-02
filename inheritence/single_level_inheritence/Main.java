package inheritence.single_level_inheritence;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car(4, "Red", 120, 6);
		
		System.out.println("No Of Wheels: " + myCar.noOfWheels);
		System.out.println("Car Color: " + myCar.color);
		System.out.println("Max Speed: " + myCar.maxSpeed);
		System.out.println("No Of Seats: " + myCar.noOfSeats);
		
		myCar.start();
		myCar.drive();
		myCar.Break();
		myCar.stop();
	}
}
