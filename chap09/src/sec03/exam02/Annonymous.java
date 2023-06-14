package sec03.exam02;

public class Annonymous {
	RemoteControl rc = new RemoteControl() {

		public void turnOn() {
			System.out.println("a");

		}

		public void turnOff() {
			System.out.println("b");

		}

	};

	void method1() {
		new RemoteControl() {

			public void turnOn() {
				System.out.println("a");

			}

			public void turnOff() {
				System.out.println("b");

			}

		};
		rc.turnOff();
		rc.turnOn();
	}
}
