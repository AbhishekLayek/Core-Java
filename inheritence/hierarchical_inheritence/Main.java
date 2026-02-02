package inheritence.hierarchical_inheritence;

public class Main {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger("Sheru", 4, "Yellow");
		
		System.out.println("Name of Tiger: " + tiger.name);
		System.out.println("No Of Legs: " + tiger.noOfLegs);
		System.out.println("Color: " + tiger.color);
		
		tiger.roar();
		tiger.eat();
		tiger.sleep();
		
		Dog dog = new Dog("Tommy", 4, "Black");
		
		System.out.println("Name of Dog: " + dog.name);
		System.out.println("No Of Legs: " + dog.noOfLegs);
		System.out.println("Color: " + dog.color);
		
		dog.bark();
		dog.eat();
		dog.sleep();
	}
}
