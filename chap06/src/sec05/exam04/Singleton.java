package sec05.exam04;

public class Singleton {
	//객체생성을 통해 생성한 정적필드
	private static Singleton singleton = new Singleton();
	//생성자
	private Singleton() {}
	//메소드
	static Singleton getInstance() {
		return singleton;
	}
}
