package poly.ex2;

public class AnimalPolyMain1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cow cow = new Cow();
		Cat cat = new Cat();

		// 부모클래스에는 자식 클래스를 담을수 있으므로 다양한 클래스를 담아 호출할수 있다
		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);

	}
	private static void soundAnimal(Animal animal) {
		System.out.println("동물 울음소리 시작");
		// 오버라이딩의 힘으로 부모 클래스임에도 자식 클래스의 오버라이딩 된 메서드를 사용한다.
		// 이에 따라 자식 클래스별로 같은 메서드를 클래스별 오버라이딩으로 사용할 수 있다.
		animal.sound();
		System.out.println("동물 울음소리 시작");

	}
}
