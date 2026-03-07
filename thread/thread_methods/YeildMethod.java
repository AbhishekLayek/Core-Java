/*
 * yeild(): yeild() method will provide a hint to JVM to run other thread also.
 */

package thread.thread_methods;

public class YeildMethod extends Thread{
	
	public YeildMethod(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Is Running");
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		YeildMethod t1 = new YeildMethod("Thread 1");
		YeildMethod t2 = new YeildMethod("Thread 2");
		
		t1.start();
		t2.start();
	}
}

/*
 * Possible Output:
 * 
 * Thread 1 Is Running
 * Thread 2 Is Running
 * Thread 1 Is Running
 * Thread 2 Is Running
 * Thread 1 Is Running
 * Thread 2 Is Running
 * Thread 1 Is Running
 * Thread 2 Is Running
 * Thread 2 Is Running
 * Thread 1 Is Running
 */

