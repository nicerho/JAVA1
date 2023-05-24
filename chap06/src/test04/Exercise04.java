package test04;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for(int I=0;I<array.length;I++) {
         if(max<array[I])
        	 max=array[I];
		}//ㅁㄴㅇㄴㅁㅇㄴㅁㅇㅁㄴㅇㄴㅁㅇㅁㄴㅇㄴㅁㅇ
		System.out.println("max: " + max);
	}
}
