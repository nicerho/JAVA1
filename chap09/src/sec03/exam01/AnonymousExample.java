package sec03.exam01;

public class AnnonymousExample {
	public static void main(String[] args) {
		Annonymous an = new Annonymous();
		an.field.wake();
		an.method1();
		an.method2(new Person() {
			void study() {
				System.out.println("study");
			}

			void wake() {
				System.out.println("wake");
				study();
			}
		});
	}
}
