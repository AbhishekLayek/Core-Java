/*
 * 1st Way Of Creating Thread:
 * 
 * 1) Create a class which extends to Thread Class.
 * 2) Override run() method.
 * 3) Create the object for that class inside main method and call start() method using that reference variable.
 */

package thread.creation_of_threads;

public class ExtendingThreadClass {
	public static void main(String[] args) {
		NewThreadExtendingThreadClass t1 = new NewThreadExtendingThreadClass();
		
		t1.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
