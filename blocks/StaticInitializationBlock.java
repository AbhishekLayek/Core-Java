/*
 * Static Initialization Block(SIB): Any block which is declared with static keyword.
 * 
 * Key Points:
 * 1. Static block will execute only once when class loads.
 * 2. Static block will execute before main method.
 * 3. Order of execution of static block is sequential.
 */

package blocks;

public class StaticInitializationBlock {
	
	static {
		System.out.println("Static Initialization Block 1");
	}
	
	static {
		System.out.println("Static Initialization Block 2");
	}
	
	static {
		System.out.println("Static Initialization Block 3");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}
