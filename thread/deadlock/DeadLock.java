package thread.deadlock;

public class DeadLock {
	public static void main(String[] args) {
		Pen pen = new Pen();
		Paper paper = new Paper();
		
		Thread t1 = new Thread(new Task1(pen,paper), "Thread 1");
		Thread t2 = new Thread(new Task2(pen, paper), "Thread 2");
		
		t1.start();
		t2.start();
	}
}

/*
 * Output:
 * 
 * Thread 2 Is Using Paper - thread.deadlock.Paper@2c06e991 And Trying To Use Pen - thread.deadlock.Pen@22c11261
 * Thread 1 Is Using Pen - thread.deadlock.Pen@22c11261 And Trying To Use Paper - thread.deadlock.Paper@2c06e991
 */
