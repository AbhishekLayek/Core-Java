/*
 * interrupt(): interrupt() method will interrupt the current thread.
 */

package thread.thread_methods;

public class InterruptMethod extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Thread Is Running...");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		InterruptMethod thread = new InterruptMethod();
		
		thread.start();
		thread.interrupt();
	}
}

/*
 * Output:
 * 
 * java.lang.InterruptedException: sleep interrupted
 */
