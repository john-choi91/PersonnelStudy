package poly.ex.pay0;

public class DefaultPay implements Pay{
@Override public boolean pay(int amount) {
		System.out.println("등록되지 않은 페이 서비스 입니다..");
		return false;
	}
}
