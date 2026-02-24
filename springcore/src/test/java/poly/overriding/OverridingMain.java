package poly.overriding;

public class OverridingMain {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child -> Child");
		System.out.println("Value = " + child.value);
		child.method();
		
		// 부모 변수가 부모 인스턴스 참조
		Parent parent = new Parent();
		System.out.println("Parent -> Parent");
		System.out.println("Value = " + parent.value);
		parent.method();
		
		
		Parent poly = new Child();
		
		System.out.println("Parent -> Child");
		System.out.println("Value = " + poly.value); // 변수는 오버라이딩x
		poly.method(); // 메서드는 오버라이딩
		// 오버라이딩 된 메서드는 항상 우선권을 가진다.
		// Parent 를 호출 했더라도 생성자를 Child 로 했으면 Child 내부에 오버라이딩 된 메서드 때문에 
		// 부모 메서드를 호출해도 오버라이딩 된 메서드를 가져온다.
		// 오버라이딩 된 메서드는 항상 우선권 을 가진다
		
	}
}
