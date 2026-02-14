package generics_wildcards.wildcards;

import java.util.ArrayList;

public class Wildcards {
	
	public void displayElement(ArrayList<?> list) {
		for(Object o: list) {
			System.out.println(o);
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		
		Wildcards w = new Wildcards();
		
		w.displayElement(list);
	}
}
