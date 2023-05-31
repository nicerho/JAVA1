package sec03.exam01;

public class SmartPhone extends Phone{
	
	
	public SmartPhone() {}
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("searching Internet");
	}
}

