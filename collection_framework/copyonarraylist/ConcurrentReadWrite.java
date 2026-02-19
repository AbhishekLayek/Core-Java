package collection_framework.copyonarraylist;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentReadWrite {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Milk","Eggs","Bread"));
		
		System.out.println("Initial List: " + list);
		
		for(String item: list) {
			System.out.println(item);
			if(item.equals("Eggs")) {
				list.add("Butter");
				System.out.println("Added Butter In The List While Reading");
			}
		}
		System.out.println("Final List: " + list);
		
		/*
		 * Output:
		 * 
		 * Initial List: [Milk, Eggs, Bread]
		 * Milk
		 * Eggs
		 * Added Butter In The List While Reading
		 * Bread
		 * Final List: [Milk, Eggs, Bread, Butter]
		 */
	}
}
