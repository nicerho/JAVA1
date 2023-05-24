package sec04.exam05;

public class Car {
	int speed;
	int getSpeed() {
		return speed;
	}
	void keyTurnOn() {
		System.out.println("Turning key");
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			speed=i;
			System.out.println("run "+speed+"km/h");
		}
	}
}
