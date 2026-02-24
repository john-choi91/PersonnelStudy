package poly.ex3;

public abstract class Animal {
	
	// 추상메서드는 추상 클래스에서만 사용가능하다
	// 추상메서드는 바디가 없다.
	// 추상메서드가 있는 클래스는 기능하지 않는 메서드를 가진 클래스이므로
	// 추살클래스가 되어야 한다.
	// 자식 클래스가 추상메서드를 오버라이딩 하지 않으면 같은 이유로 추상클래스가 되어야 한다.
	public abstract void sound(); 
	
	
	public void sound2() {
		System.out.println("추상 아닌 메서드");
	}
}
