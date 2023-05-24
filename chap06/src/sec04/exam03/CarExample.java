package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setGas(7);//Car의 setGas() 메소드 호출
		
		boolean gasState=myCar.isLeftGas(); //Car의 isLeftGas
		 System.out.println("drive");
		 myCar.run(); //Car의 run()메소드 호출	
		 
		if(myCar.isLeftGas()) {
			System.out.println("gasfull");
		} else {
			System.out.println("refuel");
		}

	}
}
