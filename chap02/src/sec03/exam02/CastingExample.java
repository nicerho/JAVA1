package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 강제형변환(Casting) 자동형변환(promotion)
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		//char 로 범위가 넘어가서 짤려서 '가'로 출력
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		//출력은 500으로 되었으나 총 범위는 제한되었음 (
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		//int는 소수점을 날리기 때문에 짤려서 출력
	}

}
