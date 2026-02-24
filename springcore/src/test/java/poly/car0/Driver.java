package poly.car0;

public class Driver {
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
 	
	public void drive(){
		System.out.println("운전");
		car.startEngine();
		car.pressAccelerator();
		car.offEngine();

	}
}
