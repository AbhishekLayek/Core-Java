package collection_framework.stack;

import java.util.Arrays;
import java.util.Stack;

public class IsEmptyMethod {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.isEmpty()); // true
		
		stack.addAll(Arrays.asList(10,20,30,40,50));
		
		System.out.println(stack.isEmpty()); // false
	}
}
