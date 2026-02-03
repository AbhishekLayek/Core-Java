package method_overriding;

public class WhatsApp_V2 extends WhatsApp_V1{
	 
	@Override
	void feature() {
		System.out.println("WhatsApp Version 2.0");
		System.out.println("Old Features - Text, Emojis, Images, Videos");
		System.out.println("New Features - Link, Audio, Live Location");
	}
}
