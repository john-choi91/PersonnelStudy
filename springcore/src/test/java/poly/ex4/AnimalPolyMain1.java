package poly.ex4;

public class AnimalPolyMain1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cow cow = new Cow();
		Cat cat = new Cat();
		
		soundAnimal(cat);
		moveAnimal(dog);
		
	}
	
	private static void soundAnimal(Animal animal) {
		animal.sound();
	}
	
	private static void moveAnimal(Animal animal) {
		animal.move();
	}
}
