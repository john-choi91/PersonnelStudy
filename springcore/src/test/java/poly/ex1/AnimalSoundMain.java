package poly.ex1;

public class AnimalSoundMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		
		//동물이 늘어날 수록 코드는 계속 추가 된다.
		System.out.println("동물 소리 시작");
		dog.sound();
		cat.sound();
		cow.sound();
		System.out.println("동물 소리 종료");
		// 중복을 제거 하기 위해 for 문 이나 배열 등을 활용하려 해도 
		// 각 클래스 들이 다른 타입의 클래스 이기 때문에 사용할수 없다.
	}
	
	private static void sound(Cow cow) {
		System.out.println("동물 소리 시작");
		cow.sound();
		System.out.println("동물 소리 종료");
	}
}
