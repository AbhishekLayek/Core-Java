package inheritence.hierarchical_inheritence;

public class Dog extends Animal{
	
	Dog(String name, int noOfLegs, String color){
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.color = color;
	}
	
	void bark() {
		System.out.println("Barking...");
	}
}
