package sec01.exam02;

class Name {
	static void print() {
		System.out.println("홍길동");
	}

	void print2() {
		System.out.println("yaho");
	}
}

public class StaticExample {
	public static void main(String[] args) {
		Name.print();
		Name name = new Name();
		name.print2();
	}

}
