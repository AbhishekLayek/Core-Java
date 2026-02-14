package generics_wildcards.upper_bounded_wildcards;

import java.util.ArrayList;

public class UpperBoundedWildcards {
	public void displayElement(ArrayList<? extends Number> list) { 
		// Here ? can be Number or subclass for Number class like Integer, Float, Double etc.
		for(Object o: list) {
			System.out.println(o);
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		
		UpperBoundedWildcards w = new UpperBoundedWildcards();
		
		w.displayElement(list);
	}
}
