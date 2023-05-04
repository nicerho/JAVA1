package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		// v4와 v5는 소수점자리에서 틀린 부분이 있기 때문에 false로 출력
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
	}

}
