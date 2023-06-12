package test;

public final class ShopService {
	public static int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	private static int i;
	private ShopService() {
		
	}
}
