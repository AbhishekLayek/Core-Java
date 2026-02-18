package collection_framework.vector;

import java.util.Arrays;
import java.util.Vector;

public class AccessElement {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(vector.get(1)); // 20
	}
}
