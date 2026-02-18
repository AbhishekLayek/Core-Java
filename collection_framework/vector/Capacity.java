package collection_framework.vector;

import java.util.Vector;

public class Capacity {
	public static void main(String[] args) {
		
		Vector<Integer> vector1 = new Vector<>();
		
		System.out.println("Initial Capacity: " + vector1.capacity()); // Initial Capacity: 10
		
		for(Integer i = 1; i<= 10; i++) {
			vector1.add(i);
		}
		
		vector1.add(11);
		System.out.println("New Capacity: " + vector1.capacity()); // New Capacity: 20
		
		Vector<Integer> vector2 = new Vector<Integer>(5,2);
		
		System.out.println("Initial Capacity: " + vector2.capacity()); // Initial Capacity: 5
		
		for(Integer i = 1; i<= 5; i++) {
			vector2.add(i);
		}
		
		vector2.add(6);
		System.out.println("New Capacity: " + vector2.capacity()); // New Capacity: 7
		
	}
}
