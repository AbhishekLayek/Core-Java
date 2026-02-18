package collection_framework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class TraverseElement {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
