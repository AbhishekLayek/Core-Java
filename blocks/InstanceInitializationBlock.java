/*
 * Instance Initialization Block(IIB): Any block which is declared without static keyword.
 * 
 * Key Points:
 * 1. It will get executed when object is created.
 * 2. It will execute before constructor.
 * 3. Order of execution is sequential.
 */

package blocks;

public class InstanceInitializationBlock {
	
	{
		System.out.println("Instance Initializtion Block 1");
	}
	
	{
		System.out.println("Instance Initializtion Block 2");
	}
	
	{
		System.out.println("Instance Initializtion Block 3");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		new InstanceInitializationBlock();
		
		System.out.println("Main Ends");
	}
}
