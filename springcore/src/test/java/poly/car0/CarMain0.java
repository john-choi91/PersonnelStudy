package poly.car0;

public class CarMain0 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Model3Car();
		car = new K3Car();
		car = new NewCar();
		
		driver.setCar(car);
		driver.drive();
		
//		driver.setCar(car2);
//		driver.drive();
	}
}
