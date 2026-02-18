package collection_framework.vector;

import java.util.Arrays;
import java.util.Vector;

public class RemoveElement {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>(Arrays.asList(10,20,30,40,50));
		
		vector.remove(0);
		
		System.out.println(vector); // [20, 30, 40, 50]
	}
}
