/*
 * Runnable: Runnable interface in Java is a functional interface that belongs to java.lang pacakge and it is used to define a task that can be excuted by threads but it'll not return anything.
 * 
 * Signature:   public interface Runnable{
 * 					void run();
 * 				}
 */

package thread.executor_framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable runnable = () -> System.out.println("Runnable Task");
		
		Future<?> f = executorService.submit(runnable);
		
		f.get(); // It will wait for the termination of the task
		
		if(f.isDone()) {
			System.out.println("Task Is Done");
		}
		
		executorService.shutdown(); 
	}
}

/*
 * Output:
 * 
 * Runnable Task
 * Task Is Done
 */
