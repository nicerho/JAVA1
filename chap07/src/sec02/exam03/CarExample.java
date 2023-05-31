package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1;i<=10;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼",15);
				break;
			case 2:
				System.out.println("앞오 한국타이어로 교체");
				car.frontRightTire = new KumhoTire("앞오",15);
				break;
			case 3:
				System.out.println("뒷왼 한국타이어로 교체");
				car.backLeftTire = new HankookTire("뒷왼",15);
				break;
			case 4:
				System.out.println("뒷오 한국타이어로 교체");
				car.backRightTire = new HankookTire("뒷오",15);
				break;
			}
			System.out.println("-----------------------------");
		}
}
}
