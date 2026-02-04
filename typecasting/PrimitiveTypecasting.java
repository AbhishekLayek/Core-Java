/*
 * Primitive TypeCasting: Converting one primitive datatype to another primitive datatype is called Primitive TypeCasting.
 * 
 * Types:
 * 
 * 1.Widening: Converting from smaller datatype to larger datatype.
 * 2.Narowing: Converting from larger datatype to smaller datatype.
 */

package typecasting;

public class PrimitiveTypecasting {
	public static void main(String[] args) {
		
		// Widening - Can be done both Implicitly and Explicitly
		
		float f1 = 6; // Implicit Widening
		System.out.println(f1); // 6.0
		
		float f2 = (float)10; //Explicitly Widening
		System.out.println(f2); // 10.0
		
		// Narowing - Can be done only Explicitly
		
		int i = (int)20.5;
		System.out.println(i); // 20
		
		
		
		
	}
}
