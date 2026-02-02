package inheritence.multiple_inheritence;

public class SmartPhone implements WebBrowser, Camera, MusicPlayer{
	
	@Override
	public void browseContent() {
		System.out.println("Browsing Internet");
	}
	
	@Override
	public void clickImage() {
		System.out.println("Clicking Image");
	}

	@Override
	public void recordVideo() {
		System.out.println("Record Video");
	}

	@Override
	public void playMusic() {
		System.out.println("Play Music");
	}

	@Override
	public void pauseMuic() {
		System.out.println("Pause Music");
	}

}
