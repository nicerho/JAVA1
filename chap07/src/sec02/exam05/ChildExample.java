package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = (Child) parent;
		parent.field1="data1";
		child.field2="data2";
		((Child)parent).field2="data2";
		parent.method1();
		parent.method2();
		child.method3();
		((Child) parent).method3();
	}
}
