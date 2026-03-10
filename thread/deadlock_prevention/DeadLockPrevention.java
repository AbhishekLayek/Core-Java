package thread.deadlock_prevention;

public class DeadLockPrevention {
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
 * Thread 1 Is Using Pen - thread.deadlock_prevention.Pen@2c06e991 And Trying To Use Paper - thread.deadlock_prevention.Paper@22c11261
 * Thread 1 Finished Using Paper - thread.deadlock_prevention.Paper@22c11261
 * Thread 2 Is Using Paper - thread.deadlock_prevention.Paper@22c11261 And Trying To Use Pen - thread.deadlock_prevention.Pen@2c06e991
 * Thread 2 Finished Using Pen - thread.deadlock_prevention.Pen@2c06e991
 */