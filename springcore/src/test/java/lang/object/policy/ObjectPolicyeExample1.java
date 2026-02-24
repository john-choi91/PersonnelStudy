package lang.object.policy;

public class ObjectPolicyeExample1 {
	private void mian() {
		Dog dog = new Dog();
		Car cat = new Car();
		Object o = dog;
		
		action(dog);
		action(cat);
	}
	
	private static void action(Object obj) {
//		obj.sound // 컴파일 오류 Object 는 sound() 가 없다.
	
		// 객체에 맞는 다운 캐스팅 필요
		if (obj instanceof Dog dog) {
			dog.sound();
		}else if (obj instanceof Car cat) {
			cat.move();
		}
	}
}
