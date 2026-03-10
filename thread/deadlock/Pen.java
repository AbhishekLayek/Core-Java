package thread.deadlock;

public class Pen {
	public synchronized void writeWithPenAndPaper(Paper paper) {
		System.out.println(Thread.currentThread().getName() + " Is Using Pen - " + this + " And Trying To Use Paper - " + paper);
		paper.finishWriting();
	}
	
	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " Finished Using Pen - " + this);
	}
}
