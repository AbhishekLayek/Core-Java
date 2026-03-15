/*
 * CyclicBarrier: CyclicBarrier is a synchronizer that ensures a set of threads wait for each other until they reach a common execution point called barrier.
 * 
 * Note: The barrier is called cyclic becase we can resuse it.
 */

package thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static void main(String[] args) {
		int numberOfSubSystems = 4;
		
		CyclicBarrier barrier = new CyclicBarrier(numberOfSubSystems, new Runnable() {
			@Override
			public void run() {
				System.out.println("All Sub Systems are Up & Running. System Startup Completed.");
			}
		});
		
		Thread webServerThread = new Thread(new SubSystem("WebServer", 2000, barrier));
		Thread databaseThread = new Thread(new SubSystem("Database", 3000, barrier));
		Thread cacheThread = new Thread(new SubSystem("Cache", 4000, barrier));
		Thread messagingServiceThread = new Thread(new SubSystem("Messaging Service", 3500, barrier));
		
		webServerThread.start();
		databaseThread.start();
		cacheThread.start();
		messagingServiceThread.start();
	}
}

/*
 * Output:
 * 
 * Database Initialization Started
 * Messaging Service Initialization Started
 * Cache Initialization Started
 * WebServer Initialization Started
 * WebServer Initialization Completed
 * Database Initialization Completed
 * Messaging Service Initialization Completed
 * Cache Initialization Completed
 * All Sub Systems are Up & Running. System Startup Completed.
 */
