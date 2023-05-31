package sec02.exam03;

public class Car {
	Tire frontLeftTire = new Tire("앞왼",6);
	Tire frontRightTire = new Tire("앞오",2);
	Tire backLeftTire = new Tire("뒷왼",3);
	Tire backRightTire = new Tire("뒷오",4);
	
	int run() {
		System.out.println("car running");
		if(frontLeftTire.roll()==false) {stop(); return 1;};
		if(frontRightTire.roll()==false) {stop(); return 2;};
		if(backLeftTire.roll()==false) {stop(); return 3;};
		if(backRightTire.roll()==false) {stop(); return 4;};
		return 0;
	}
	void stop() {
		System.out.println("car stop");
	}
}

