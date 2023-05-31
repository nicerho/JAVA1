package sec02.exam02;

public class ChildExample {
public static void main(String[] args) {
	Child child = new Child();
	Parent parent = child; 
	parent.method1();
	child.method2();
	((Child)parent).method3();
}
}
