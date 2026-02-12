/*
 * Generics: Generics in Java provide type safety by enabling the classes, interfaces and methods to operate on specified objects, eliminating need for explicit type casting.
 */

package generics;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
	
	/*	
	 * Without Generics(Problem):
	 * 
	 * 1. No Type Safety
	 * 2. Manual Casting 
	 * 3. No Compile time Checking
	 
		ArrayList list = new ArrayList();
		
		list.add("Hello");
		list.add(123);
		list.add(3.14);
		
		String str1 = (String)list.get(0);
		String str2 = (String)list.get(1); // class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
		
	*/
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("World");
		
		String str1 = list.get(0);
		String str2 = list.get(1);
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
