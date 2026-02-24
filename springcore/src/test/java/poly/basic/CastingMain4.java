package poly.basic;

public class CastingMain4 {
	public static void main(String[] args) {
		// 부모 변수가 자식 인스턴스 참조 (다형적 참조)
		Parent poly = new Child();
		
		//단 자식의 기능은 호출 할수 없다. 컴파일 오류 발생
		//poly.childMethod();
		
		//다운캐스팅(부모타입 -> 자식 타입)
		Child child = (Child)poly; //x001
		child.childMethod();
		
		//일시적  다운 캐스팅 - 해당 매서를 호출하는 순간만 다운캐스팅
		((Child)poly).childMethod();// 연산자 우선 순위가 childMethod() 에 있어 캐스팅에 괄호를 추가해 우선순위를 올린다.
		
		Child child2 = new Child();
		
		((Parent)child2).parentMethod(); // 연산자 우선순위와 상관없이도 캐스팅에는 괄호가 필요한듯?
		
	}
}
