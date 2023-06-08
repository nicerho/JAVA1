package sec02.exam01;

class Human{
	// 생략
	}

	class Student extends Human{
	// 생략
	}
	 class CastingTest {
		public static void main(String[] args) {
	    
	    	Student student = new Student();
	        Human human = student; 
	        // 자식 클래스(Student)가 부모 클래스(Human)타입으로 캐스팅
	  	}
	}