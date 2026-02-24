package poly.basic;

public class CastingMain2 {
	public static void main(String[] args) {
		//다운캐스팅을 자동으로 하지 않는 이유 
		
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		
		
		


		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
		
		
	}
	
	
	private static void call(Parent parent) {
		if(parent instanceof Child ) {
			System.out.println("Child");
			Child child = (Child)parent;
			child.childMethod();
		} else {
			System.out.println("Not Child");
		}
	}
}
