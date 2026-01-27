package java_basics;

public class Syntax {
	
	/*
	 * public: Access specifier, indicates that the main method can be accessed from the outside of class. So that JVM can access main method.
	 * 
	 * static: Modifier, indicates that the method belongs to class rather than instance of class.  To access main method object creation is not required.
	 * 
	 * void: Return type, indicates that the method will not return any value.
	 * 
	 * String[] args: Specifies that the method will take array of String as parameter. Here we can pass command-line arguments.
	 */
	
	public static void main(String[] args) {
		
		/*
		 * System: System is a class belongs to java.lang package which provides access to the system including console. It consist of some 
		 *         utility methods, which will communicate to the runtime environment of the system.
		 * 
		 * out: out is instance variable of PrintStream class within System class.
		 * 
		 * println: Method which is used to print line of text on console.
		 */
		
		System.out.println("welcome To Java");
	}
}
