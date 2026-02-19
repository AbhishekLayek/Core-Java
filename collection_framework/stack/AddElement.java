package collection_framework.stack;

import java.util.Stack;

public class AddElement {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.add(1, 20); // We can add element in specific index also
		
		System.out.println(stack); // [10, 20, 30, 40, 50]
	}
}
