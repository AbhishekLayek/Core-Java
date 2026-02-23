package collection_framework.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Delayed{
	
	private final String taskName;
	private final long startTime;
	
	public DelayedTask(String taskName, long delay, TimeUnit unit) {
		this.taskName = taskName;
		this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
	}

	@Override
	public int compareTo(Delayed o) {
		if(this.startTime < ((DelayedTask)o).startTime) {
			return -1;
		}
		if(this.startTime > ((DelayedTask)o).startTime) {
			return 1;
		}
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long remaing = startTime - System.currentTimeMillis();
		return unit.convert(remaing, TimeUnit.MILLISECONDS);
	}
	
	public String getTaskName() {
		return taskName;
	}
}
