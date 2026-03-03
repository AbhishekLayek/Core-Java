/*
 * ConcurrentSkipListMap: ConcurrentSkipListMap class in Java belongs to java.util.concurrent pacakge and it implements ConcurrentNavigableMap interface. It is thread-safe, sorted.
 */

package collection_framework.concurrentskiplistmap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 1000; i++) {
				map.put(i, "Thread 1");
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 1000; i < 2000; i++) {
				map.put(i, "Thread 2");
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(map.size()); // 2000
	}
}
