package sec01.exam04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnon();
		rc.setVolume(5);
		rc.turnoff();

		rc = new Audio();
		rc.turnon();
		rc.setVolume(5);
		rc.turnoff();		
	}
}
