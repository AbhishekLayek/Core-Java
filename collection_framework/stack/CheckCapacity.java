package collection_framework.stack;
import java.util.Stack;

public class CheckCapacity {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("Initial Capacity: " + stack.capacity()); // Initial Capacity: 10
		
		for(Integer i = 1; i<= 10; i++) {
			stack.add(i);
		}
		
		stack.add(11);
		System.out.println("New Capacity: " + stack.capacity()); // New Capacity: 20
	}
}
