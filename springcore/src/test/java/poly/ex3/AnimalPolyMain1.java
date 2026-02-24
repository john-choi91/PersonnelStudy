package poly.ex3;

public class AnimalPolyMain1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cow cow = new Cow();
		Cat cat = new Cat();
		
//		Animal animal = new Animal(); // 추상클래스 호출 불가
		
		cat.sound();
		cat.sound2();
		
	}
}
