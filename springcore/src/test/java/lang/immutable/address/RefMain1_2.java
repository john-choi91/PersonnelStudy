package lang.immutable.address;

public class RefMain1_2 {
	public static void main(String[] args) {
		// 참조형 변수는 하나의 인스턴스를 공유 할 수 있다.
		Address address = new Address("서울");
		Address b = new Address("서울");
		
		
		System.out.println(address); // 서울
		System.out.println(b); // 서울
		
		b.setValue("부산");
		System.out.println(b);//부산
		System.out.println(address);//서울
		
	}
}