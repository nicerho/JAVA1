package sec04.exam04;

public class QstopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true)	{
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break; //key코드가 113과 동일할 경우 실행
			}
		}
		System.out.println("종료");
	}
	
	
}
