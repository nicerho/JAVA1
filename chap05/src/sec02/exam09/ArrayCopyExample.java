package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] newstrarray=new String[5];
		String[] oldstrarray= {"java","array","copy"};
		System.arraycopy(oldstrarray,0,newstrarray,2,oldstrarray.length);
		//원본배열,시작인덱스,새배열,새배열 시작인덱스,복사할갯수
		for(int i=0;i<newstrarray.length;i++) {
			System.out.println(newstrarray[i]);
		}
	}

}
