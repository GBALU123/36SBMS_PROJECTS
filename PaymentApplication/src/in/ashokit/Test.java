package in.ashokit;

public class Test {

	public static void main(String[] args) {
		
		CreditCardPayment ccd  = new CreditCardPayment();
		DebitCardPayment dbt = new DebitCardPayment();
		SodexoCardPayment spy = new SodexoCardPayment();
		// CI
		PaymentProcessor processor = new PaymentProcessor(spy);
		
		// SI
		processor.setPayment(dbt);
		processor.processPayment();
	}
}
