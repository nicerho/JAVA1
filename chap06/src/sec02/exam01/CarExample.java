package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//필드 값 읽기
		//Car클래스자료형
		//c1객체
		//new Car(); <-생성자호출
		Car c1=new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		c1.speed=60;
		System.out.println(c1.speed);
	}

}
