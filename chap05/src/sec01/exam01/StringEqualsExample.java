package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1="전정호";
		String strVar2="전정호";
		if(strVar1==strVar2) {
			System.out.println("strVar1과strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과strVar2는 참조가 다름");
		}
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("strVar1과strVar2는문자열이 같음");
		}
		String strVar3 = new String("전정호");
		String strVar4 = new String("전정호");
		if(strVar3==strVar4) {
			System.out.println("strVar1과strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과strVar2는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과strVar4는문자열이 같음");
		}
	}

}
