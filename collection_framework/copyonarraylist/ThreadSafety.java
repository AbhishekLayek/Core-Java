package collection_framework.copyonarraylist;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafety {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Milk","Eggs","Bread"));
		
		Thread readerThread = new Thread(()->{
			try {
				while(true) {
					for(String item: list) {
						System.out.println("Reading Item: " + item);
						Thread.sleep(100);
					}
				}
			}
			catch(Exception e) {
				System.out.println("Exception In Reader Thread: " + e);
			}
		});
		
		Thread writterThread = new Thread(()->{
			try {
				Thread.sleep(500);
				list.add("Butter");
				System.out.println("Added Butter To The List");
				
				Thread.sleep(500);
				list.remove("Milk");
				System.out.println("Removed Milk From The List");
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		readerThread.start();
		writterThread.start();
	}
}
