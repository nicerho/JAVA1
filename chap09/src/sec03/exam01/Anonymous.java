package sec03.exam01;

public class Annonymous {
	// new Person(){}
	// Person():부모클래스 상속
	// {} <- 자식클래스(익명)의 내용 서술
	// new <- new로 객체를 생성(자식객체)
	// Person field :부모클래스 변수(필드)에 대입 ->자동형변환
	Person field = new Person() {
		void work() {
			System.out.println("work");
		}
		void wake() {
			System.out.println("wake at 7am");
			work();
		}
	};
		void method1() {
			Person local =new Person() {
				void work() {
					System.out.println("workwork");
				}
				void wake() {
					System.out.println("wake at 1am");
					work();
				
		}
	};

	}
		void method2(Person person) {
			person.wake();
		}
;
}