/*
 * Interface: Interface is supermost java type.
 * 
 * Key Points:
 * 1. Inside Interface we can have only two members - Variable and method.
 * 2. All the variables are by default - static and final.
 * 3. All the methods are by default - public and abstract.
 * 4. Interface dosen't support constructor.
 * 5. We cannot create object for interface.
 */

package Interface;

public interface Interface {
	
	public static final String bankName = "SBI";
	
	public abstract void UserName();
	public abstract void Password();
}
