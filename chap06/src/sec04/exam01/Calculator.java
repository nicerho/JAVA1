package sec04.exam01;

public class Calculator {
	void poweron() {
		System.out.println("ON");
	}
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	double divide(double x, int y) {
		double result=(double)x/(double)y;
		return result;
	}
	void poweroff() {
		System.out.println("OFF");
	}
}
