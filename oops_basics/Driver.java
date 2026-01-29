/*
 * Object: Object is an instance of class. It is a real world entity which has its own state and behavior.
 * State: State is represented by attributes of the object.
 * Behavior: Behavior is represented by methods of the object.
 */

package oops_basics;

public class Driver {
	public static void main(String[] args) {
		
		// Create Object For Car Class
		Car myCar = new Car();
		
		// Assigning The Values To Attributes
		
		myCar.name = "BMW";
		myCar.color = "Black";
		myCar.noOfWheels = 4;
		myCar.noOfSheets = 6;
		myCar.maxSpeed = 200;
		
		// Accessing The Attributes
		
		System.out.println("Car Name: " + myCar.name);
		System.out.println("Car Color: " + myCar.color);
		
		// Accessing The Behaviors
		
		myCar.start();
		myCar.drive();
		myCar.Break();
		myCar.stop();
	}
}
