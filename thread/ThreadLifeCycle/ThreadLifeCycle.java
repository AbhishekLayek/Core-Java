/*
 * Thread Life Cycle: The life cycle of a thread in Java consist of several states which the thread can move through during its execution.
 * 
 * 1) NEW - A thread is in NEW state when the thread is created but not yet running.
 * 2) RUNNABLE - Once start() method is called then the thread will be in RUNNABLE state. In RUNNABLE state the thread will be ready for execution but waiting for CPU time.
 * 3) RUNNING: A thread will be in RUNNING state when it is executing.
 * 4) BLOCK/WAITING: A thread will be in lock/Waiting state when it's waiting for a resource or for another thread to perform an action.
 * 5) TERMINATED: A thread will be in TERMINATED state when it has finished it's execution.
 */

package thread.ThreadLifeCycle;

public class ThreadLifeCycle extends Thread{
	@Override
	public void run() {
		System.out.println("RUNNING");
		try {
			Thread.sleep(200);
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycle t1 = new ThreadLifeCycle();
		System.out.println(t1.getState()); // NEW
		
		t1.start();
		System.out.println(t1.getState()); // RUNNABLE
		
		Thread.sleep(100);
		System.out.println(t1.getState()); // TIMED_WAITING
		
		t1.join();
		System.out.println(t1.getState()); // TERMINATED
	}
}
