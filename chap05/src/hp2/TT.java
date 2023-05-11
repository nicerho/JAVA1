package hp2;

public class TT {
    public static void main(String[] args) {
    	int sum=0;
    	for (int j = 1; j <100; j++) {
			if(j%3 ==0) {
				sum += j;
				System.out.println(sum);
			}
		}
    }
}