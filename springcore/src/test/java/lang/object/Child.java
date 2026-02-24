package lang.object;


// object -> parent - > child 순으로 상속 되고 있는 거임
public class Child extends Parent{
	public void childMethod() {
		System.out.println("Child.childMethod");
	}
}
