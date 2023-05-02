package sec02.exam07;

public class ForfloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기값; 최종값; 증가값) {}
		//var float x = 0.1f
		//A = A + B , A += B
		//for 문은 수치계산용으로 사용하지말자
		for(float x=0.1f; x<=1.0f; x+=0.1f)
			System.out.println(x);
	}

}
