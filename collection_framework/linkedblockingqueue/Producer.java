package collection_framework.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<Integer> queue;
	private int value = 0;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Producer Produced: " + value);
				queue.put(value++);
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Producer Interrupted");
			}
		}
	}
}
