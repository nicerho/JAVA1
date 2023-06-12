package test;

public class Soundrunner {
	public static void printsound(Soundable soundable) {
		soundable.Sound();
	}
	public static void main(String[] args) {
		
		printsound(new Cat());
	}
}
