package sec01.exam07;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "부장";
		
		switch(position) {
			case "부장":
				System.out.println("700");
				break;
			case "과장":
				System.out.println("500");
				break;
			default:
				System.out.println("300");
				break;
		}
	}

}
