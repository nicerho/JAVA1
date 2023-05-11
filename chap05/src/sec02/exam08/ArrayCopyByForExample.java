package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldintarray= {1,2,3};
		int[] newintarray=new int[5];
		for(int i=0;i<oldintarray.length;i++) {
			newintarray[i]=oldintarray[i];
		}
		for(int i=0;i<newintarray.length;i++) {
			System.out.println(newintarray[i]);
		}
	}

}
