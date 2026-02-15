package collection_framework.arraylist;

import java.util.ArrayList;

public class GetMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.get(1)); // 20
	}
}
