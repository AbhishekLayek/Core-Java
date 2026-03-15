/*
 * volatile Keyword: volatile keyword ensures the visibility of variable changes accross different threads.
 * 
 * Note:
 * 
 * Threads generally uses cache memory to store variable values and then they read the value from cache memory instaed of main memory. volatile keyword makes these threads to read value from main memory.
 */

package thread.volatile_keyword;

public class SharedResource {
	private volatile boolean flag = false;
	
	public void setFlagTrue() {
		System.out.println("Writer Thread Made The Flag True!");
		flag = true;
	}
	
	public void printIfFlagTrue() {
		while(!flag) {
			
		}
		System.out.println("The Flag Is True");
	}
}
