/*
 * Member Inner Class: In Java just like variables, methods, constructor, A class too have another class as its member. It'll be associated with the instance of the outer class.
 */

package inner_class.member_inner_class;

public class Car {
	
	private String model;
	private boolean isEngineOn;
	
	public Car(String model) {
		this.model = model;
		this.isEngineOn = false;
	}
	
	// Member Inner Class
	class Engine{
		
		void start() {
			if(!isEngineOn) {
				isEngineOn = true;
				System.out.println(model + " Engine Started.");
			}
			else {
				System.out.println(model + " Engine Already ON.");
			}
		}
		
		void stop() {
			if(isEngineOn) {
				isEngineOn = false;
				System.out.println(model + " Engine Stopped.");
			}
			else {
				System.out.println(model + " Engine Already OFF.");
			}
		}
	}
}
