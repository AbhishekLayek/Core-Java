/*
 * Polymorphism: It is one of the OOPs concept that allows methods to behave differently depending on the object that calls the method.
 * 
 * Types Of Polymorphism:
 * 
 * 1. Compiletime Polymorphism - Method declaration getting binded to method definition during compile time by the compiler based on argument passed.
 * 2. Runtime Polymorphism - Method declaration getting binded to method definition during run time by the JVM based on object created.
 */

package polymorphism.compiletime_polymorphism;

public class User {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(10, 15));
		System.out.println(calc.add(10, 15, 20));
		System.out.println(calc.add(10.5, 15.5));
	}
}
