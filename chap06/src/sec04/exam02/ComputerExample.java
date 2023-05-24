package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom =new Computer(); 
		int[] values1= {1,2,3};
		int result1= myCom.sum1(values1);
		System.out.println(result1);
		
		int result2=myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println(result3);
		int result4 = myCom.sum2(1,2,3,5,7,5,4,3,5,6,7,4,3,2,4,5,76,5,4,3,2,54,6);
		System.out.println(result4);
	}

}
