package sec01.exam05;

public class SwichExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) + 1 ;
		switch(num) {
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default :
				System.out.println("6");
				break;
		}
	}

}
