package super_keyword;

public class WhatsApp_V2 extends WhatsApp_V1{
	 
	@Override
	void feature() {
		
		super.feature(); // It will provide Superclass implementation.
		
		System.out.println("WhatsApp Version 2.0");
		System.out.println("New Features - Link, Audio, Live Location");
	}
}
