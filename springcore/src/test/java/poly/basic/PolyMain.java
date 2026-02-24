package poly.basic;


public class PolyMain {
	public static void main(String[] args) {
		// 부모변수가 부모 인스턴스 참조
		// 메모리 상에 부모 클래스 만 생성
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		
		// 자식변수가 자식 인스턴스 참조
		// 메모리 상에 자식 부모 클래스 둘다 생성
		System.out.println("Child -> Child");
		Child child =new Child();
		child.parentMethod();
		child.childMethod();
		
		//부모 변수가 자식 인스턴스 참조 (다형적 참조)
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		poly.parentMethod();
		//poly.chidMethod(); // 자식의 기능은 호출 할 수 없다.
		// 자식 기능을 호출하려면 자식으로의 다형성 캐스팅이 필요하다.
		// 다형성 참조는 22
		
		
		//Child child1 = new Parent(): // 자식 은 부모를 담을 수 없다
		Parent parent1 = new Child(); // 부모는 자식을 담을 수 있다.
			
	}
}
