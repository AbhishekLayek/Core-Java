package collection_framework.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	private BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = queue.take();
				System.out.println("Consumer Consumed: " + value);
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Consumer Interrupted");
			}
		}
	}
}
