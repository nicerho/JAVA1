package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("번호\t이름\t직업");
		// \t는 tab이라고 생각하자
		System.out.println("행 단위 출력\n");
		// \n은 줄 바꿈 println에서 'ln'의 역할
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다.");
		// "앞에 \을 붙이면 문법이 아닌 문자로 "을 인식한다
		System.out.println("봄\\여름\\가을\\겨울");
		// 그냥 내용에 \을 쓰고 싶으면 하나 더 붙여 \\로 쓰기
	}

}
