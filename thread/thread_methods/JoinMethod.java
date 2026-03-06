/*
 * join(): join() method will wait for the termination of current thread, then only proceed to next steps.
 */

package thread.thread_methods;

public class JoinMethod extends Thread{
	
	public JoinMethod(String name) {
		super(name);
;	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		JoinMethod j = new JoinMethod("Thread 1");
		
		j.start();
		
		// j.join();
		
		System.out.println("After Termination of Thread 1, Remaining Part Will Execute");
	}
}
