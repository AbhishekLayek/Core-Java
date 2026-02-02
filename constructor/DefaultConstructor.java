/*
 * Constructor: It is a special type of member which is used to initialize the object state.
 * 
 * Rules:
 * 1. class name and constructor name should be same.
 * 2. It doesn't support return type, so not return any value.
 * 3. When object is created, constructor automatically get called or invoked.
 * 
 * Default Constructor: The constructor which don't have any parameters is called default constructor.
 * 
 * Key Points:
 * 1. It is used to assign default value to object attributes or state.
 * 2. If we didn't mention default constructor explicitly , Java Compiler will internally assign default constructor.
 */

package constructor;

public class DefaultConstructor {
	
	public DefaultConstructor() {
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) {
		new DefaultConstructor();
	}
}
