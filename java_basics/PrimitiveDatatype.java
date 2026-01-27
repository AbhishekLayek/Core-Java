/* Datatype: The type of data which stored inside variable is called Datatype.
 * It represents two things -
 * 1. Type of data
 * 2. Range or Capacity 
 */

package java_basics;

public class PrimitiveDatatype {
	public static void main(String[] args) {
		
		byte b = 1; // byte datatype
		short s = 2; // short datatype
		int i = 4; // int datatype
		long l = 8; // long datatype
		float f = 4.0f; // float datatype
		double d = 8.0; // double datatype
		char c = 'A'; // char dataype
		boolean bool = true; // boolean datatype
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		
		System.out.println("Size of byte: " + Byte.SIZE + " bits");
		System.out.println("Size of short: " + Short.SIZE + " bits");
		System.out.println("Size of int: " + Integer.SIZE + " bits");
		System.out.println("Size of long: " + Long.SIZE + " bits");
		System.out.println("Size of float: " + Float.SIZE + " bits");
		System.out.println("Size of double: " + Double.SIZE + " bits");
		System.out.println("Size of char: " + Character.SIZE + " bits");
	}
}
