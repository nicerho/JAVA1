package test3;

public class BtnRunner {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setListener(new Ml());
		btn.touch();
	}
}
