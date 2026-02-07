/*
 * equals(): equals() method is used to compare two object address.
 */

package object_class;

public class EqualsMethod {
	public static void main(String[] args) {
			
		EqualsMethod e1 = new EqualsMethod();
		EqualsMethod e2 = new EqualsMethod();
		EqualsMethod e3 = e1;
		
		System.out.println(e1.equals(e2)); // false
		System.out.println(e1.equals(e3)); // true
	}
}
