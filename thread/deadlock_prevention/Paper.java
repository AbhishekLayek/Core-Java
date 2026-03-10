package thread.deadlock_prevention;

public class Paper {
	public synchronized void writeWithPaperAndPen(Pen pen) {
		System.out.println(Thread.currentThread().getName() + " Is Using Paper - " + this + " And Trying To Use Pen - " + pen);
		pen.finishWriting();
	}
	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " Finished Using Paper - " + this);
	}
}
