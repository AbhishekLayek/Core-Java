/*
 * 2nd Way Of Creating Thread -
 * 
 * 1) Create a class which implements Runnable interface.
 * 2) Override run() method.
 * 3) Create the object for that class inside main method.
 * 4) Create theobject for Thread class by passing the object for that thread class.
 * 5) Call start() method using the reference variable.
 */

package thread.creation_of_threads;

public class ImplementingRunnableInterface {
	public static void main(String[] args) {
		NewThreadImplementingRunnableInterface newThread = new NewThreadImplementingRunnableInterface();
		
		Thread t1 = new Thread(newThread);
		
		t1.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
