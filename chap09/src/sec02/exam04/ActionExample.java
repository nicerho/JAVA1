package sec02.exam04;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
			System.out.println("copy");
			}
		};
		action.work();
	}
}
