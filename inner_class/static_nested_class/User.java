package inner_class.static_nested_class;

public class User {
	public static void main(String[] args) {
		
		Computer computer = new Computer("DELL", "Inspiron 16 Plus 7640");
		Computer.USB usb = new Computer.USB("Type-C");
		
		computer.computerInfo();
		usb.usbInfo();
	}
}
