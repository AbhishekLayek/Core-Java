/*
 * start(): start() method will initiate the execution of a thread by causing JVM to call run() method.
 * 
 * run(): run() method will consist the actual code that will be run by the thread.
 */

package thread.thread_methods;

public class RunAndStartMethod extends Thread{
	
	public RunAndStartMethod(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Is Running");
	}
	
	public static void main(String[] args) {
		
		RunAndStartMethod rs = new RunAndStartMethod("Thread 1");
		
		rs.start();
	}
}
