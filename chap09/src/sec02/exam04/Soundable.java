package sec02.exam04;

public interface Soundable {
	String sound();
}
class Cat implements Soundable{
	public String sound() {
	return "a";

	}
}
class Dog implements Soundable{
	public String sound() {

		return "wow";
	}

}

