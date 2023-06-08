package sec01.exam03;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		A.C c = new A.C();
		c.method2();
		a.method();
	}
}
