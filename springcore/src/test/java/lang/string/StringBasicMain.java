package lang.string;

public class StringBasicMain {
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		// String 은 클래스다 자주 쓰는 클래스다 보니 생성자로 객체 생성을 하지 않더라도 
		// 변수 대입만 해도 자동으로 생성자로 생성한것처럼 동작하게 만들어져 있다.
		
		System.out.println(str1.valueOf(1));
	}
}

//public final class String{
//	private final char[] value;
//	private final byte[] value;
//	
//}
