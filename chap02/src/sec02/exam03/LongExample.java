package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; //컴파일에러 1조 (-2,147,483,648~2,147,483,647) <- int 범위 여길 넘으면 long을 쓰자
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
