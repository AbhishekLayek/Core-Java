package thread.executor_framework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
	public static void main(String[] args) {
		ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);
		
		schedular.schedule(()-> System.out.println("Task Executed After 5 Seconds Delay"), 5, TimeUnit.SECONDS);
		
		schedular.shutdown();
	}
}

/*
 * Output:
 * 
 * Task Executed After 5 Seconds Delay
 */