/*
 * Static Nested Class: It is similar like member inner class, but it'll be associated with the outer class rather than instance of outer class.
 */

package inner_class.static_nested_class;

public class Computer {
	
	private String brand;
	private String model;
	
	public Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void computerInfo() {
		System.out.println("Computer Brand: " + brand + "\nModel: " + model);
	}
	
	// Static Nested Class
	static class USB{
		private String type;
		
		public USB(String type) {
			this.type = type;
		}
		
		public void usbInfo() {
			System.out.println("USB Type: " + type);
		}
	}
}
