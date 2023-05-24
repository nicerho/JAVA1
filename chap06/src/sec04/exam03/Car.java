package sec04.exam03;

public class Car {
	//필드
	int gas;
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("low gas");
			return false;
		}
		System.out.println("full gas");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("drive(gas:"+gas+")");
				gas -= 1;			
			} else {
				System.out.println("stop(gas:"+gas+")");
				return;
			}
		}
	}
}
