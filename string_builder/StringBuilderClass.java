/*
 * StringBuilder: StringBuilder is a mutable sequence of characters but it is not thread safe.
 * 
 * Features:
 * 1. Mutable: allows modification in the same string object.
 * 2. Not Thread Safe: It is not synchronized, so not thread safe.
 * 3. Fast: Performance is fast.
 * 4. Useful for single threaded program.
 */

package string_builder;

public class StringBuilderClass {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" World");
		sb.append("!");
		
		System.out.println(sb); // Hello World!
	}
}
