package hp222;

public class Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95,83},
				{83,84,95},
				{78,85,78,96,87},
		};
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<i;j++) {
				sum += array [i][j];
			}
			System.out.println(sum);
		}
		}
	}


