package sec01.exam04;

public class Outter {
	public static void main(String[] args) {
		
	}
	String field = "Outter";
	void method() {
		System.out.println("OM");
	}
	class Nested{
		String field = "Nested";
		void method() {
			System.out.println("NM");	
	}
		void print() {
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
}
	
}
