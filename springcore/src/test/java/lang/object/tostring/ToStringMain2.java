package lang.object.tostring;


public class ToStringMain2 {
	public static void main(String[] args) {
		Car car = new Car("Mdodel Y");
		Dog dog = new Dog("멍멍이1", 2);
		Dog dog2 = new Dog("멍멍이2", 4);
		
		System.out.println(" 1 단순");
		System.out.println(car);
		System.out.println(dog);
		System.out.println(dog2);
	}
}
