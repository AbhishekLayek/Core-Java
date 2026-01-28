/*
 * Method Overloading: Developing multiple method with the same name but variations in the argument list is called Method Overloading.
 * 
 * Variations in the arguments include:
 * 1. Variations in the datatype.
 * 2. Variations in the length of the arguments.
 * 3. Variations in the order of occurrence of arguments.
 */

package methods;

public class MethodOverloading {
	
	static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	static void add(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	static void add(double n1, double n2) {
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10.5,20.5);
	}
}
