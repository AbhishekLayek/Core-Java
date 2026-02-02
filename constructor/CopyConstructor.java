/*
 * Copy Constructor: Copy Constructor is used to call by passing an object, and it will copy the data available in passed object to newly created object.
 */

package constructor;

public class CopyConstructor {
	
	int id;
	String name;
	
	public CopyConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CopyConstructor(CopyConstructor obj) {
		this.id = obj.id;
		this.name = obj.name;
	}
	
	
	public static void main(String[] args) {
		CopyConstructor obj1 = new CopyConstructor(101, "Abhishek");
		System.out.println("Id: " + obj1.id + " , Name: " + obj1.name);
		
		CopyConstructor obj2 = new CopyConstructor(obj1);
		System.out.println("Id: " + obj2.id + " , Name: " + obj2.name);
	}
}
