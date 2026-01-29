/* Class: class is a blueprint or template which is used to create object. 
 * It consists set of attributes and properties or behaviors that will be same for all instances for the class,
 */

package oops_basics;

public class Car {
	
	// Attributes
	String name;
	String color;
	int noOfWheels;
	int noOfSheets;
	float maxSpeed;
	
	//Properties or Behaviors
	
	void start() {
		System.out.println("Car Is Started...");
	}
	
	void drive() {
		System.out.println("Driving...");
	}
	
	void Break() {
		System.out.println("Applied Break...");
	}
	
	void stop() {
		System.out.println("Car Is Stopped...");
	}
}
