package poly.ex.pay0;

public class PayService {
	
	
	
	public void processPay(String payService, int amount) {
		boolean result;
		Pay pay = new DefaultPay();
		System.out.println("결제를 시작합니다 option=" + payService + ", amount=" + amount);

		StorePay storePay = new StorePay();
		pay	= storePay.findPay(payService);
		
		result = pay.pay(amount);			
		
		if (result) {
			System.out.println("결제성공.");
			} else {
			System.out.println("결제실패.");
			}
	}
}	
	
	

	
	
