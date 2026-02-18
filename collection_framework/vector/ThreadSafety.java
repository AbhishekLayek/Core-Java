package collection_framework.vector;

import java.util.Vector;

public class ThreadSafety {
	public static void main(String[] args) throws InterruptedException{
		
		Vector<Integer> vector = new Vector<>();
		
		Thread t1 = new Thread(()->{
			for(Integer i = 1; i <= 1000; i++) {
				vector.add(i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(Integer i = 1; i <= 1000; i++) {
				vector.add(i);
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Size Of Vector: " + vector.size()); // Size Of Vector: 2000
	}
}
