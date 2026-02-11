/*
 * Wrapper Class: A wrapper class in Java is a class which will wrap a primitive datatype into an object.
 */

package wrapper_class;

public class WrapperClass {
	public static void main(String[] args) {
		Byte b = 10;
		Short s = 20;
		Integer i = 30;
		Long l = 40L;
		Float f = 10.5f;
		Double d = 20.5;
		Character c = 'A';
		Boolean bool = true;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		
		// Utility Methods
		
		
		System.out.println("Size of Byte: " + Byte.SIZE);
		System.out.println("Max Value Of Byte: " + Byte.MAX_VALUE);
		System.out.println("Min Value Of Byte: " + Byte.MIN_VALUE);
		
		System.out.println("Size of Short: " + Short.SIZE);
		System.out.println("Max Value Of Short: " + Short.MAX_VALUE);
		System.out.println("Min Value Of Short: " + Short.MIN_VALUE);
		
		
		System.out.println("Size of Integer: " + Integer.SIZE);
		System.out.println("Max Value Of Integer: " + Integer.MAX_VALUE);
		System.out.println("Min Value Of Integer: " + Integer.MIN_VALUE);
		
		System.out.println("Size of Long: " + Long.SIZE);
		System.out.println("Max Value Of Long: " + Long.MAX_VALUE);
		System.out.println("Min Value OfLong: " + Long.MIN_VALUE);
		
		System.out.println("Size of Float: " + Float.SIZE);
		System.out.println("Max Value Of Float: " + Float.MAX_VALUE);
		System.out.println("Min Value Of Float: " + Float.MIN_VALUE);
		
		System.out.println("Size of Double: " + Double.SIZE);
		System.out.println("Max Value Of Double: " + Double.MAX_VALUE);
		System.out.println("Min Value Of Double: " + Double.MIN_VALUE);
		
		System.out.println("Size of Character: " + Character.SIZE);
		System.out.println("Max Value Of Character: " + Character.MAX_VALUE);
		System.out.println("Min Value Of Character: " + Character.MIN_VALUE);
	
	}
}
