package thread.thread_communication;

public class Consumer implements Runnable{
	private SharedResource resource;

	public Consumer(SharedResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			int value = resource.consume();
		}
	}
}
