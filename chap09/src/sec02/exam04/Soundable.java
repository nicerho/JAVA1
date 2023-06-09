package sec02.exam04;

public interface Soundable {
	String sound();
}
class Cat implements Soundable{
	Cat(){
		System.out.println("와우");
	}
	public String sound() {
	return "a";

	}
}
class Dog implements Soundable{
	Dog(){
		System.out.println("우와");
	}
	public String sound() {
		System.out.println("www");
		return "wow";
	}

}

