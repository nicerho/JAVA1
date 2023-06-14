package test2;

public class ButtonRunner {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();
	}
}
