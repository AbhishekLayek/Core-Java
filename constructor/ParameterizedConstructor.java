/*
 * Parameterized Constructor: Any constructor that accepts parameter.
 */

package constructor;

public class ParameterizedConstructor {
	
	int id;
	String name;
	
	public ParameterizedConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor(101, "Abhishek");
		
		System.out.println("Id: " + pc.id + ", Name: " + pc.name);
	}
}
