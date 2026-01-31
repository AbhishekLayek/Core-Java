package this_keyword;

public class Car {
	
	String name;
	String color;
	int noOfWheels;
	int noOfSeats;
	float fuelInLiters;
	
	public Car start() {
		if(fuelInLiters == 0) {
			System.out.println("Fuel Is Not Sufficient, Car Cannot Start.");
		}
		else if(fuelInLiters < 5) {
			System.out.println("Car Is In Fuel Reserve Mode, Please Refuel");
		}
		else {
			System.out.println("Car Is Started...");
		}
		return this;
	}
	
	public void drive() {
		System.out.println("Car Is Driving...");
		fuelInLiters--;
	}
	
	public void addFuel(float fuelInLiters) {
		this.fuelInLiters += fuelInLiters; // this will refer to the current instance variable.
	}
	
	public void Break() {
		System.out.println("Applied Break...");
	}
	
	public void stop() {
		System.out.println("Car Is Stopped.");
	}
}
