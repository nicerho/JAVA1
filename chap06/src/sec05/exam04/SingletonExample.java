package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton x = new Singleton(); 
		Singleton x =  Singleton.getInstance();
		Singleton y =  Singleton.getInstance();
		
	if(x == y) {
		System.out.println("same");
	} else {
		System.out.println("diff");
	}
}
}