package collection_framework.copyonwritearrayset;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	public static void main(String[] args) {
		
		CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
		
		for(int i = 1; i <= 5; i++) {
			set.add(i);
		}
		System.out.println("Initial Set: " + set);
		
		for(Integer item: set) {
			System.out.println(item);
			set.add(6);
		}
		
		System.out.println("Final Set: " + set);
	}
}

/*
 * Output:
 * 
 * Initial Set: [1, 2, 3, 4, 5]
 * 1
 * 2
 * 3
 * 4
 * 5
 * Final Set: [1, 2, 3, 4, 5, 6]
 */
