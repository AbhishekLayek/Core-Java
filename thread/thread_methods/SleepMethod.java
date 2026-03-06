/*
 * Thread.sleep(): It will pause the execution of current thread for few miliseconds.
 */

package thread.thread_methods;

public class SleepMethod extends Thread{
	
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
		SleepMethod s = new SleepMethod();
		
		s.start();
	}
}
