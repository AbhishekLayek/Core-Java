package collection_framework.stack;

import java.util.Stack;

public class AccessElement {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		Integer peekElement = stack.peek(); // Peek Element
		
		System.out.println(peekElement); // 50
		
		System.out.println(stack.get(1)); // 20
	}
}
