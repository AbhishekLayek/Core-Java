package inheritence.multiple_inheritence;

public class User {
	public static void main(String[] args) {
		
		SmartPhone OnePlus = new SmartPhone();
		
		OnePlus.browseContent();
		OnePlus.clickImage();
		OnePlus.recordVideo();
		OnePlus.playMusic();
		OnePlus.pauseMuic();
	}
}
