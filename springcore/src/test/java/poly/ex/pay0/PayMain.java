package poly.ex.pay0;

public class PayMain {
	public static void main(String[] args) {
		PayService processPay = new PayService();
		
		String payService = "NewPay";
		int amount = 100;
		processPay.processPay(payService,amount);
				
	}
}
