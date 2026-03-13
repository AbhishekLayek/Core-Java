/*
 * Executor Framework: The Executor Framework was introduced in Java 5, it belongs to java.util.concurrent package that simplifies the development  
 *  				   of concurrent applications by abstracting many of the complexties including creating and managing threads.
 * 					
 */

package thread.executor_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
	private static long factorial(int n) {
		try {
			Thread.sleep(1000);		
		}
		catch(InterruptedException e) {
			new RuntimeException(e);
		}
		long result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for(int i = 1; i < 10; i++) {
			int finalI = i;
			executorService.submit(()->{
				long result = factorial(finalI);
				System.out.println(result);
			});
		}
		executorService.shutdown();
		try {
			while(!executorService.awaitTermination(1, TimeUnit.MILLISECONDS)) {
				
			}
		}
		catch(InterruptedException e) {
			new RuntimeException(e);		
		}
		System.out.println("Total Time: " + (System.currentTimeMillis() - startTime));
	}
}

/*
 * Output:
 * 
 * 1
 * 2
 * 6
 * 120
 * 24
 * 720
 * 40320
 * 5040
 * 362880
 * Total Time: 3014
 */
