package collection_framework.vector;

import java.util.Vector;

public class AddElement {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		vector.add(0, 10);
		
		System.out.println(vector); // [10, 20, 30, 40, 50]
	}
}
