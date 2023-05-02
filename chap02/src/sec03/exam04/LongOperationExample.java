package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		//byte result = value1 + value2 + value3;
		//result가 127이상 이기때문에 value1도 long의 범위안에 들어가서 byte로 출력 불가
		System.out.println(result);
	}

}
