/*
 * getClass(): It will give the runtime class of object.
 */

package object_class;

public class GetClassMethod {
	public static void main(String[] args) {
		
		String s = new String("Abhishek");
		
		Class<? extends String> c = s.getClass();
		
		System.out.println(c); // class java.lang.String
		
		System.out.println(c.getName()); // java.lang.String
	}
}
