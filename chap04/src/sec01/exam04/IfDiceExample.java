package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 45까지의 난수 : (int)(Math.random()*44) + 1
		int num = (int)(Math.random()*6) + 1;
		if(num==1) {
			System.out.println("1번");
		} else if (num==2) {
			System.out.println("2번");
		} else if (num==3) {
			System.out.println("3번");
		} else if (num==4) {
			System.out.println("4번");
		} else if (num==5) {
			System.out.println("5번");
		} else  {
			System.out.println("6");
		}
	}

}
