/*
 * CountDownLatch: CountDownLatch is a synchronization aid in Java that allows one or more threads to wait until a set of operations performed by other threads completes.
 */

package thread.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
	public static void main(String[] args) throws InterruptedException {
		int numberOfServices = 3;
		
		ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
		
		CountDownLatch latch = new CountDownLatch(numberOfServices);
		
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		
		latch.await();
		System.out.println("Main");
		executorService.shutdown();
	}
}

/*
 * Output:
 * 
 * pool-1-thread-2 Service Started
 * pool-1-thread-1 Service Started
 * pool-1-thread-3 Service Started
 * Main
 */