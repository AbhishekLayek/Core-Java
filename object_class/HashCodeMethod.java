/*
 * hasCode(): Whenever we invoke hashCode() method it'll give random integer numbers called hash number based on object address.
 */

package object_class;

public class HashCodeMethod {
	public static void main(String[] args) {
		
		HashCodeMethod h1 = new HashCodeMethod();
		HashCodeMethod h2 = new HashCodeMethod();
		
		System.out.println(h1.hashCode()); // 1421795058
		System.out.println(h2.hashCode()); // 1555009629
		
	}
}
