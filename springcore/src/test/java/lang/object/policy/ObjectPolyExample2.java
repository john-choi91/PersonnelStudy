package lang.object.policy;

public class ObjectPolyExample2 {
	private void mian() {
		Dog dog = new Dog();
		Car cat = new Car();
		Object object = new Object();
		
		Object[] objects = {dog,cat,object};
	}
	private static void size(Object[] objects) {
		System.out.println(objects.length);
	}
}
