/*
 * Unboxing: Unboxing is the process of converting a wrapper class object back into its corresponding primitive datatype. 
 */

package wrapper_class;

public class Unboxing {
	public static void main(String[] args) {
		
		Integer obj = Integer.valueOf(10);
		
		int i = obj.intValue(); // Explicit Unboxing
		System.out.println(i);
		
		int n = obj; // Implicit Unboxing or Auto Unboxing
		System.out.println(n);
	}
}
