package sec04.exam05;

import java.util.Scanner; //<- Ctrl + Shift + O 입력

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.contentEquals("q"))	{
				break;
			}
		}
		System.out.println("종료");
	}

}
