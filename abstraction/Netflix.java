/*
 * Abstraction: Hiding the complexity of the system and providing only essential features to the end user is called as Abstraction.
 * 
 * How To Achieve:
 * 1. Declare all essential properties inside interface.
 * 2. Provide implementation inside subclass or implementation class.
 * 3. Create a reference variable of interface type and initialize that reference variable with implementation class object.
 */

package abstraction;

public interface Netflix {
	public abstract void watch();
}
