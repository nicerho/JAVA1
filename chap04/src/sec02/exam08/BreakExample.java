package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*99) + 1;
			System.out.println(num);
			if(num==99) {
				break;
			}
		}
		System.out.println("end");
	}

}
