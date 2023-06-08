package sec04.exam01;

public class Child extends Parent{
	private int studentNo;
	
	
	public Child(String name) {
		super(name);

	}
	public Child(String name,int studentNo){
		super(name);
		studentNo=studentNo;
	}

}
