/*
 * Main Thread: When Java program runs a Main Thread will automatically created, which will execute the main method.
 */

package thread.main_thread;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("Hello Java"); // Hello Java
		System.out.println(Thread.currentThread().getName()); // main
	}
}
