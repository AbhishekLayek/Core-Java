/*
 * Callable: Callable interface in Java is a functional interface belongs to java.util.concurrent package and use to define a task that can be executed by multiple threads and it'll return result.
 */

package thread.executor_framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Callable<String> callable = () -> "Hello";
		
		Future<String> f = executorService.submit(callable);
		
		System.out.println(f.get()); // Hello
		
		executorService.shutdown();
	}
}
