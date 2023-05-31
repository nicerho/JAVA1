package sec03.exam01;

public abstract class Phone {
	public String owner;
	
	public Phone() {
	}
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnon() {
		System.out.println("phone on");
	}
	public void turnoff() {
		System.out.println("phone off");
	}
}
