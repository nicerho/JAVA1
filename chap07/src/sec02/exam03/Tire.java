package sec02.exam03;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"tire수명"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"tire flat ***");
			return false;
		}
	}
}