/*
 * toString(): Whenever we want to print reference variable toString() method will automatically get called or invoked, which will return fully qualified path.
 */

package object_class;

public class ToStringMethod {
	public static void main(String[] args) {
		
		ToStringMethod t = new ToStringMethod();
		
		String fullyQualifiedPath = t.toString();
		
		System.out.println(t); // object_class.ToStringMethod@54bedef2
		System.out.println(fullyQualifiedPath); // object_class.ToStringMethod@54bedef2
	}
}
