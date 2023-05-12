package test;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int[] array= {1,5,3,8,2};
		for(int x:array) {
			max=array[3];
			
		}
		System.out.println(max);
		
		int top=0;
		int[] ff= {1,5,3,8,2};
		for(int i=0;i<ff.length;i++) {
			if(top<ff[i]) {
				top=ff[i];
			}
		}
		System.out.println(top);
		
	}

}
