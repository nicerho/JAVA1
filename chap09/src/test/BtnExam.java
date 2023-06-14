package test;

public class BtnExam {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new Calllistener());
		btn.touch();
	}
}
