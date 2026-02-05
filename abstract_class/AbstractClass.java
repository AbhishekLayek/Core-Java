/*
 * Abstract Class: any class which declared with abstract keyword is called as abstract class.
 * 
 * Key Points:
 * 1. If any class contains atleast one abstract method, then the class should be declared with abstract keyword.
 * 2. Inside abstract method we can have both concrete method and abstract method.
 * 3. Abstract class support constructor also.
 * 4. Abstract method cannot declared as - static, private and final.
 */

package abstract_class;

public abstract class AbstractClass {
	
	public abstract void disp1(); // Abstract Method
	public abstract void disp2(); // Abstract Method.
	
	// Concrete Method
	public void disp3() {
		System.out.println("Welcome To Abstract Class");
	}
	
}
