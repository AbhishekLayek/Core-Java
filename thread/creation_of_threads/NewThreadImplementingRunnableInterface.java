package thread.creation_of_threads;

public class NewThreadImplementingRunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
