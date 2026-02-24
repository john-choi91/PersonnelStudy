package poly.ex5;

public class InterfaceMain {
	public static void main(String[] args) {
		//InterfaceAnimal  interfaceAnimal = new InterfaceAnimal(); 완전 추상이므로 에러 
		
		InterfaceAnimal dog = new Dog();
		Cow cow = new Cow();
//		Cat cat = new Cat();
		
		soundAnimal(new Cat());
		moveAnimal(dog);
		
		
		//클래스 추상클래스 인터페이스는 프로그램 코드 메모리 구조상 모두 같다 다만 제약조건이 다르다
		// 순수 추상클래스라는 용어는 딱히 존재하지 않는다 이는 인터페이스로 대체한다.
		// 상속 vs 구현
		// 부모클래스의 기능을 자식 클래스가 상속 받을 떄 
		// 부모클래스를 오버라이딩 해서 구현 할떄
		
	}
	
	private static void soundAnimal(InterfaceAnimal animal) {
		animal.sound();
	}
	
	private static void moveAnimal(InterfaceAnimal animal) {
		animal.move();

	}
}
