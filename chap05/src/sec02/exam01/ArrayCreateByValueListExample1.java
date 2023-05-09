package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores= {83,90,87}; //배열선언, 선언과 동시에 값을 집어 넣는 방법
		int[] scores1;
		//scores1= {83,90,87}; 변수처럼 먼저 선언하고 나중에 값을 넣는것도 불가능
		scores1=new int[] {83,90,87};//위와 동일하나 참조변수 선언하듯 값을 넣는것은 가능
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		double avg = (double)sum/3;
		System.out.println(avg);
	}

}
