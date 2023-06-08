package sec01.exam01;

public class MotorbikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(0);
		ducati.start();
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		ducati.decreaseSpeed(200);
		System.out.println(ducati.getSpeed());

	}

}
