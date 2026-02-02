/*
 * Constructor Overloading: Developing multiple constructor with the same name, but variations in the arguments is called Constructor Overloading.
 */

package constructor;

public class ConstructorOverloading {
	
	public ConstructorOverloading(int id) {
		System.out.println("Id: " + id);
	}
	
	public ConstructorOverloading(int id, String name) {
		System.out.println("Id: " + id + " , Name: " + name);
	}
	
	public ConstructorOverloading(String name, int id) {
		System.out.println("Name: " + name + " , Id: " + id);
	}
	
	public static void main(String[] args) {
		new ConstructorOverloading(101);
		new ConstructorOverloading(101, "Abhishek");
		new ConstructorOverloading("Payel", 102);
	}
}
