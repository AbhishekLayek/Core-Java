package inheritence.hierarchical_inheritence;

public class Tiger extends Animal{
	
	Tiger(String name, int noOfLegs, String color){
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.color = color;
	}
	
	void roar() {
		System.out.println("Roaring...");
	}
}
