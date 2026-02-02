package inheritence.single_level_inheritence;

public class Car extends Vehicle{
	int noOfSeats;
	
	Car(int noOfWheels, String color, float maxSpeed, int noOfSeats){
		this.noOfWheels = noOfWheels;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.noOfSeats = noOfSeats;
	}
	
	void drive() {
		System.out.println("Driving...");
	}
}
