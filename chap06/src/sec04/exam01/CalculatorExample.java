package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc=new Calculator();
		myCalc.poweron();
		int result1=myCalc.plus(5, 6);
		System.out.println(result1);
		double x=10.5;
		byte y=4;
		double result2=myCalc.divide(x,y);
		System.out.println(result2);
		myCalc.poweroff();
	}

}
