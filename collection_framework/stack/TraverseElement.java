package collection_framework.stack;

import java.util.Arrays;
import java.util.Stack;

public class TraverseElement {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.addAll(Arrays.asList(10,20,30,40,50));
		
		for(int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
	}
}
