package collection_framework.stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveElement {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.addAll(Arrays.asList(10,20,30,40,50));
		
		System.out.println("Before Pop: " + stack); // Before Pop: [10, 20, 30, 40, 50]
		
		Integer removedElement = stack.pop();
		
		System.out.println(removedElement); // 50
		
		System.out.println("After Pop: " + stack); // After Pop: [10, 20, 30, 40]
	}
}
