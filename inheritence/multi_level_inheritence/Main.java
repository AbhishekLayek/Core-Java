package inheritence.multi_level_inheritence;

public class Main {
	public static void main(String[] args) {
		Son s = new Son();
		
		System.out.println("Hair Color: " + s.hairColor);
		System.out.println("Eye Color: " + s.eyeColor);
		System.out.println("Height: " + s.height);
		
		s.sing();
		s.dance();
		s.playCricker();
	}
}
