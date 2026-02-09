/*
 * StringBuffer: StringBuffer is a mutable sequence of characters and it is not thread safe.
 * 
 * Features:
 * 1. Mutable: allows modification in the same string object.
 * 2. Thread Safe: It is synchronized, so thread safe.
 * 3. Fast: Performance is slow.
 * 4. Useful for multi threaded program.
 */


package string_buffer;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append(" World");
		sb.append("!");
		
		System.out.println(sb); // Hello World!
	}
}
