/*
 * Super() Calling Statement: It is used to call from subclass constructor to it immediate superclass constructor.
 * 
 * Key Points:
 * 1. super() calling statement should be the first statement in subclass constructor.
 * 2. We cannot write more than one super() calling statement inside single constructor.
 */

package super_calling_statement;

public class SuperClass {
	
	public SuperClass(float f) {
		System.out.println(f);
	}
}
