package in.ashokit;

public class PaymentProcessor {

	private Ipayment payment = null;
	
	// for constructor injection
	public PaymentProcessor(Ipayment payment) {
		this.payment = payment;
	}
	// for setter injection
	
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	public void processPayment() {
		
		boolean status = payment.pay();
		
		if(status) {
			System.out.println("payment completed Thank you......");
		}else {
			System.out.println("payment failed");
		}
	}
}
