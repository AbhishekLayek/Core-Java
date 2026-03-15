package thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SubSystem implements Runnable{
	private String name;
	private int initializationTime;
	private CyclicBarrier barrier;
	
	public SubSystem(String name, int initializationTime, CyclicBarrier barrier) {
		this.name = name;
		this.initializationTime = initializationTime;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			System.out.println(name + " Initialization Started");
			Thread.sleep(initializationTime);
			System.out.println(name + " Initialization Completed");
			barrier.await();
		}
		catch(InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
