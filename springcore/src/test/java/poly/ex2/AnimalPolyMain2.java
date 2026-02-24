package poly.ex2;



public class AnimalPolyMain2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cow cow = new Cow();
		Cat cat = new Cat();

		// 부모클래스에는 자식 클래스를 담을수 있으므로 다양한 클래스를 담아 호출할수 있다
		Animal[] animalArr = {dog, cat, cow};
		
		//Animal[] animalArr = {new Dog() , new Cat(), new Cow()}; // 도 가능
		for (int i = 0; i < animalArr.length; i++) {
			Animal animal = animalArr[i];
			animal.sound();
		}
	}

}


//이렇게 다 처리하고 나면 두가지 문제가 남는다
// 1.animal 을 호출해서 그냥 사용해버리는경우 ( 부모클래스는 사실상 역할이 타입에 가깝기에 부모 클래스를 생성 해서 사용해버리면 실무기능 문제가 생길 수 있다)
// 2.sound 를 오버라이딩 하지 않은경우 ( 부모 메서드가 나옴)