package string_builder;

public class StringBuilderExample extends Thread{
	 static StringBuilder sb = new StringBuilder("Hello");
	 
	 public void run() {
		 for(int i = 0; i < 5; i++) {
			 sb.append(" World");
		 }
	 }
	 
	 public static void main(String[] args) throws InterruptedException {
		Thread t1 = new StringBuilderExample();
		Thread t2 = new StringBuilderExample();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(sb); 
		/* Possible Output:
		 * 
		 * Hello World World World World World World World World World World
		 * 
		 * Or 
		 * 
		 * Hello World World World World World
		 */
	}
}
