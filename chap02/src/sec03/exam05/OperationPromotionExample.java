package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //컴파일에러
		//변수끼리 계산하면 강제로 int로 승격된다
		//잘 이해 안가면 걍 그런갑다
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A'+1;
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; //컴파일에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		//위와 같은이유로 강제로 int로 승격, 문자로 출력하고싶으면 char를 붙여 강제로 출력가능
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; //컴파일에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}

}
