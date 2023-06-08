package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
		
		animalSound(new Cat());
		animalSound(new Dog());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
