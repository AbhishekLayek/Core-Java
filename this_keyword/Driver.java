package this_keyword;

public class Driver {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		// Car currentCar = myCar.start(); // It will return the reference of the current object
		// currentCar.drive();
		
		myCar.start().drive(); // myCar.start() will return the reference of the current object, using that we can call drive() method.
	}
}
