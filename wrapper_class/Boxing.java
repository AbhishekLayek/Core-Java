/*
 * Boxing: Boxing is the process of converting a primitive datatype into its corresponding wrapper class object.
 */

package wrapper_class;

public class Boxing {
	public static void main(String[] args) {
		
		int i = 10; // Primitive datatype
		
		Integer obj1 = Integer.valueOf(i); // Explicit Boxing
		System.out.println(obj1);
		
		Integer obj2 = i; // Implicit Boxing or Auto Boxing
		System.out.println(obj2);
	}
}
