package string_buffer;

public class StringBufferExample extends Thread{
	
	static StringBuffer sb = new StringBuffer("Hello");
	 
	 public void run() {
		 for(int i = 0; i < 5; i++) {
			 sb.append(" World");
		 }
	 }
	 
	 public static void main(String[] args) throws InterruptedException {
		Thread t1 = new StringBufferExample();
		Thread t2 = new StringBufferExample();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(sb); // Output(Always): Hello World World World World World World World World World World
	}
}
