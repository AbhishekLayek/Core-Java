/*
 * Class TypeCasting: Converting one classtype into another classtype is called as Class TypeCasting.
 * 
 * Types:
 * 
 * 1.Upcasting: converting subclass object to superclass type.
 *   -> In upcasting we'll get only superclass implementation.
 *   -> It can be done both implicitly and explicitly.
 *   
 * 2.Downcasting: converting superclass object to subclass type.
 *   -> In downcasting we'll get both subclass and superclass implementation.
 *   -> It can be done explicitly only.
 *   -> Before downcasting we need to perform upcasting.
 * 
 */

package typecasting;

public class ClassTypecasting {
	public static void main(String[] args) {
		
		SuperClass sup = new SubClass(); // Upcasting
		sup.show();
		
		SubClass sub = (SubClass)sup; // Downcasting
		sub.show();
		sub.display();
	}
}
