package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간:" + time + "시]");
		
		switch(time) {
			case 8:
				System.out.println("출");
			case 9:
				System.out.println("회");
			case 10:
				System.out.println("업");
			default:
				System.out.println("외");
		}
	}

}
