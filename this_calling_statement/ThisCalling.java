/*
 * this() calling statement: It is used to call from one constructor to another constructor within same class.
 * 
 * Key Points:
 * 1. this() calling statement should be the first statement in each constructor.
 * 2. We cannot write more than one this() calling statement in single constructor.
 */

package this_calling_statement;

public class ThisCalling {
	
	
	public ThisCalling(int n) {
		System.out.println(n);
	}
	
	public ThisCalling(double d) {
		
		this(10);
		System.out.println(d);
	}
	
	public ThisCalling(String s) {
		this(20.5);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		new ThisCalling("Hello");
	}
}
