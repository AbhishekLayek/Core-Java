package loops;

public class ForEachLoop {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Elements Of The Given Array Is: ");
		
		for(int element: arr) {
			System.out.println(element);
		}
	}
}
