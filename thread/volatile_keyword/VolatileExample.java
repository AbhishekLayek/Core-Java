package thread.volatile_keyword;

public class VolatileExample {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		
		Thread writerThread = new Thread(()->{
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				Thread.currentThread().interrupt();
			}
			resource.setFlagTrue();
		});
		
		Thread readerThread = new Thread(()-> resource.printIfFlagTrue());
		
		writerThread.start();
		readerThread.start();
	}
}


/*
 * Output:
 * 
 * Writer Thread Made The Flag True!
 * The Flag Is True
 */