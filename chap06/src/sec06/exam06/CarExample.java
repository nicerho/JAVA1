package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		if(!myCar.isStop()) {
			myCar.setStop(true);
		
		}
		System.out.println(myCar.getSpeed());
	}

}
