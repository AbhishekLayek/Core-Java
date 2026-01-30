/*
 * Reference Variable: It is a special type of variable which is used to store reference or memory address of an object in heap memory.
 * 
 * Key Properties:
 * 1. It will not store the object itself, only reference of it.
 * 2. The default value is null.
 * 3. multiple reference variable can refer to the same object.
 */

package reference_variable;

public class ReferenceVariable {
	public static void main(String[] args) {
		
		// Reference Variable Declaration
		ReferenceVariable rf;
		
		// Reference Variable Initialization
		rf = new ReferenceVariable();
		
		// Reference Variable Declaration & Initialization
		ReferenceVariable rv = new ReferenceVariable();
		
		// Printing Reference Variable - It will give object address of fully qualified path(package_name.class_name@hexadecimal_number)
		System.out.println(rf);
		System.out.println(rv);
	}
}
