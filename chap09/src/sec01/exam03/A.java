package sec01.exam03;

public class A {
	A() {
		System.out.println("A");
	}

	public class B {
		B() {

			System.out.println("B");
		}

		int field1;

		// static int field2;
		void method1() {
			System.out.println("ho");
		}

	}

	static class C {
		C() {
			System.out.println("C");
		}

		int field1;
		static int field2;

		static void method2() {
			System.out.println("wow");
		}
	}

	void method() {
		 class D {
			D() {
				System.out.println("D");
			}

			int field1;

			void method5() {
				System.out.println("asdasdsd");
			}
		}
		D d = new D();
		d.field1 = 3;
		d.method5();
	}
}
