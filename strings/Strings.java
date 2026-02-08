/*
 * String: 
 * -> A string is a sequence of characters.
 * -> In Java, String is a final class which belongs to java.lang package.
 * -> String class cannot be inherited since it's final class.
 * -> String is immutable.
 * -> We can create object of String class in two ways.
 * 	  1. Using String Literal
 *    2. Using new Keyword
 */

package strings;

public class Strings {
	public static void main(String[] args) {
		
		// String Object creation Using String Literal
		String s1 = "Hello"; // Create String object inside String Constant Pool(SCP) Area inside Heap memory and return the reference to s1.
		
		String s2 = "Hello"; // JVM will check "Hello" is present or not inside SCP, if present it'll use it. So s2 will refer same "Hello".
		
		System.out.println(s1 == s2); // == will compare two string object address.
		
		System.out.println(s1.equals(s2)); // .equals() will compare two string object values.
		
		// String Object creation Using String Literal
		String s3 = new String("Hello"); // JVM will check "Hello" is present or not inside SCP, if present then it will create new object inside heap and copy the value from SCP.
		
		System.out.println(s1 == s3); // false
		
		System.out.println(s1.equals(s3)); // true
		
		String s4 = s3.intern(); // .intern() method will return the SCP reference
		
		System.out.println(s1 == s4); // true
		
		s1.concat(" World"); // It will not change the existing object, new object will create inside SCP.
		
		System.out.println(s1); // Still gives Hello
		
		s1 = s1.concat(" Java"); // New object will create and now s1 will refer to this new object.
		
		System.out.println(s1); // Hello Java
		
	}
}
