package sec02.exam06;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기값;최종값;증가값)
		int total = 0;
		for(int i=0; i<=10; i++){
			total +=i;
			System.out.print(i);
			if(i!=10) {
				System.out.print("+");
			}
		}
		System.out.println("="+total);
		System.out.print("껄껄");
	}

}
