package sec01.exam05;

public class MyClass {

	RemoteControl rc = new Television();

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnon();
		rc.setVolume(5);
	}

	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnon();
		rc.setVolume(5);
	}
	void methodB(Television television) {
		rc.turnon();
		rc.setVolume(2);
	}
}
