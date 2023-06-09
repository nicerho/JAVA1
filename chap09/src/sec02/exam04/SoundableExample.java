package sec02.exam04;

public class SoundableExample {

	private static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printsound(new Cat());
		printsound(new Dog());
	}
}
