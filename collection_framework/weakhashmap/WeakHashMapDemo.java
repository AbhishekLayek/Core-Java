/*
 * WeakHashMap: WeakHashMap class in Java belongs to java.til package that implements Map Interface. WeakHashMap stores keys using weak references.
 */

package collection_framework.weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	private static void simulateApplicationRunning() {
		try {
			System.out.println("Simulationg Application Running...");
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		
		imageCache.put(new String("img1"), new Image("Image 1"));
		imageCache.put(new String("img2"), new Image("Image 2"));
		
		System.out.println("Cache Before Running: " + imageCache); // Cache Before Running: {img1=Image 1, img2=Image 2}
		
		System.gc(); // Suggesting JVM to collect the garbage
		
		simulateApplicationRunning();
		
		System.out.println("Cache After Running: " + imageCache); // Cache After Running: {}
	}
}
